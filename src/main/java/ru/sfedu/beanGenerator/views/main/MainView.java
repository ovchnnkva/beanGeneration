package ru.sfedu.beanGenerator.views.main;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import lombok.extern.slf4j.Slf4j;
import ru.sfedu.beanGenerator.converter.YmlConverter;
import ru.sfedu.beanGenerator.model.Activity;
import ru.sfedu.beanGenerator.parser.PumlParser;
import ru.sfedu.beanGenerator.views.components.DownloadDiv;
import ru.sfedu.beanGenerator.views.components.UploadPuml;

import java.util.List;

import static ru.sfedu.beanGenerator.util.FileUtil.getFileWithStringContent;
import static ru.sfedu.beanGenerator.util.FileUtil.getStringFromBuffer;

@PageTitle("BeanGenerator")
@Route(value = "")
@Slf4j
public class MainView extends FormLayout {

    private UploadPuml uploadPuml;
    private TextArea pumlFileTextArea;
    private TextArea yamlTextArea;
    private final DownloadDiv downloadDiv;
    private final PumlParser parser;
    private final YmlConverter converter;
    private MemoryBuffer buffer;

    public MainView(PumlParser parser, YmlConverter converter,
                    DownloadDiv downloadDiv) {
        this.parser = parser;
        this.converter = converter;
        this.downloadDiv = downloadDiv;

        configureUpload();
        configureLayout();
    }

    private void configureLayout() {
        pumlFileTextArea = new TextArea();
        pumlFileTextArea.setReadOnly(true);
        pumlFileTextArea.setVisible(false);
        pumlFileTextArea.setId("pumlText");

        yamlTextArea = new TextArea();
        yamlTextArea.setReadOnly(true);
        yamlTextArea.setVisible(false);
        yamlTextArea.setId("yamlText");

        add(uploadPuml, downloadDiv, pumlFileTextArea, yamlTextArea);
    }

    private void configureUpload() {
        buffer = new MemoryBuffer();
        uploadPuml = new UploadPuml(buffer);

        uploadPuml.addSucceededListener(e -> {
            succeededFile(buffer);
        });

        uploadPuml.addDropFileListener(e -> {
            clear();
        });
    }

    private void succeededFile(MemoryBuffer buffer) {
        String inputStr = getStringFromBuffer(buffer);
        List<Activity> activity = parser.getActivities(inputStr);
        log.debug("activity count " + activity.size());

        pumlFileTextArea.setValue(inputStr);
        pumlFileTextArea.setVisible(true);

        yamlTextArea.setValue(String.join("\n", converter.getYamlString(activity)));
        yamlTextArea.setVisible(true);

        downloadDiv.addLinkToFile(getFileWithStringContent(converter.getYamlString(activity), buffer.getFileName()));
    }

    private void clear() {
        pumlFileTextArea.clear();
        yamlTextArea.clear();
        downloadDiv.clear();
        parser.clear();

        pumlFileTextArea.setVisible(false);
        yamlTextArea.setVisible(false);
    }
}
