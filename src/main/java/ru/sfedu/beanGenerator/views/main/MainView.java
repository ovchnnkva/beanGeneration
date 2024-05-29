package ru.sfedu.beanGenerator.views.main;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import lombok.extern.slf4j.Slf4j;
import ru.sfedu.beanGenerator.converter.YmlConverter;
import ru.sfedu.beanGenerator.model.Activity;
import ru.sfedu.beanGenerator.parser.PumlParser;
import ru.sfedu.beanGenerator.util.FileUtil;
import ru.sfedu.beanGenerator.views.components.DownloadDiv;
import ru.sfedu.beanGenerator.views.components.UploadPuml;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

import static ru.sfedu.beanGenerator.constants.ExtensionsConstant.*;
import static ru.sfedu.beanGenerator.constants.PathConstant.FILES_DIR;
import static ru.sfedu.beanGenerator.constants.UIConstant.WRONG_CREATE_DIAGRAM;
import static ru.sfedu.beanGenerator.util.FileUtil.*;
import static ru.sfedu.beanGenerator.util.PlantUMLDiagramUtil.createDiagramPng;

@PageTitle("BeanGenerator")
@Route(value = "")
@Slf4j
public class MainView extends FormLayout {

    private UploadPuml uploadPuml;
    private TextArea pumlFileTextArea;
    private TextArea yamlTextArea;
    private HorizontalLayout imageLayout;
    private final DownloadDiv downloadDiv;
    private final PumlParser parser;
    private final YmlConverter converter;
    private MemoryBuffer buffer;

    public MainView(PumlParser parser, YmlConverter converter,
                    DownloadDiv downloadDiv) {
        this.parser = parser;
        this.converter = converter;
        this.downloadDiv = downloadDiv;

        configureLayout();
        setListeners();
    }

    private void configureLayout() {
        buffer = new MemoryBuffer();
        uploadPuml = new UploadPuml(buffer);

        pumlFileTextArea = new TextArea();
        pumlFileTextArea.setReadOnly(true);
        pumlFileTextArea.setVisible(false);
        pumlFileTextArea.setId("pumlText");
        pumlFileTextArea.setHeight("400px");

        yamlTextArea = new TextArea();
        yamlTextArea.setReadOnly(true);
        yamlTextArea.setVisible(false);
        yamlTextArea.setId("yamlText");
        yamlTextArea.setHeight("400px");

        imageLayout = new HorizontalLayout();
        imageLayout.setVisible(false);
        imageLayout.setWidthFull();
        this.setColspan(imageLayout, 2);
        imageLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        imageLayout.setId("imageLayout");
        add(uploadPuml, downloadDiv, pumlFileTextArea, yamlTextArea, imageLayout);
    }

    private void setListeners() {
        uploadPuml.addSucceedFileListener(e -> {
            succeededFile();
        });

        uploadPuml.addDropFileListener(e -> {
            clear();
        });
    }

    private void succeededFile() {
        saveFile(buffer.getInputStream(), buffer.getFileName());
        String inputStr = getFileContent(buffer.getFileName());
        List<Activity> activity = parser.getActivities(inputStr);
        String yamlString = converter.getYamlString(activity);
        log.debug("activity count " + activity.size());

        Image image = createDiagramImage();
        if (image == null) return;

        showComponents();

        imageLayout.add(image);
        pumlFileTextArea.setValue(inputStr);
        yamlTextArea.setValue(yamlString);

        saveFile(getInputStream(yamlString), replaceFileExtension(buffer.getFileName(), YAML_EXTENSION));
        downloadDiv.addLinkToFile(getFile(replaceFileExtension(buffer.getFileName(), YAML_EXTENSION)));
    }

    private void showComponents() {
        imageLayout.removeAll();
        imageLayout.setVisible(true);
        pumlFileTextArea.setVisible(true);
        yamlTextArea.setVisible(true);
    }

    private Image createDiagramImage() {
        log.info("createDiagramImage");
        AtomicReference<Image> image = new AtomicReference<>();
        Objects.requireNonNull(createDiagramPng(getFile(buffer.getFileName()))).ifPresentOrElse(diagramPng -> {
            StreamResource imageResource = new StreamResource(diagramPng.getName(),
                    () -> getClass().getResourceAsStream(FILES_DIR + diagramPng.getName()));

            image.set(new Image(imageResource, "PlantUML Diagram"));
        }, this::showErrorCreateDiagram);

        return image.get();
    }

    private void showErrorCreateDiagram() {
        Notification.show(WRONG_CREATE_DIAGRAM, 5000, Notification.Position.BOTTOM_END);
    }

    private void clear() {
        pumlFileTextArea.clear();
        yamlTextArea.clear();
        downloadDiv.clear();
        parser.clear();
        imageLayout.removeAll();
        imageLayout.setVisible(false);
        deleteFile(replaceFileExtension(buffer.getFileName(), PNG_EXTENSION));
        deleteFile(replaceFileExtension(buffer.getFileName(), PUML_EXTENSION));
        deleteFile(replaceFileExtension(buffer.getFileName(), YAML_EXTENSION));

        pumlFileTextArea.setVisible(false);
        yamlTextArea.setVisible(false);
    }
}
