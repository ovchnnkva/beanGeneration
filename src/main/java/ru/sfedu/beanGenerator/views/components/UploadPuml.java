package ru.sfedu.beanGenerator.views.components;

import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.upload.SucceededEvent;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.UploadI18N;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.dom.DomEventListener;

import static ru.sfedu.beanGenerator.constants.UIConstant.DROP_FILE_LABEL;
import static ru.sfedu.beanGenerator.constants.UIConstant.WRONG_FILE_TYPE;

public class UploadPuml extends Upload {
    public UploadPuml(MemoryBuffer buffer) {
        super(buffer);
        setStyles();
        addListeners();
    }

    public void addSucceedFileListener(ComponentEventListener<SucceededEvent> listener) {
        this.addSucceededListener(listener);
    }

    public void addDropFileListener(DomEventListener event) {
        this.getElement().addEventListener("upload-abort", event);
    }

    private void setStyles() {
        this.setI18n(new UploadI18N());
        this.setAcceptedFileTypes(".puml");

        Button uploadButton = new Button("Выбрать puml...");
        this.setUploadButton(uploadButton);
        this.setDropLabel(new Span(DROP_FILE_LABEL));
    }

    private void addListeners(){
        this.addFileRejectedListener(e -> {
            Notification notification = Notification.show(WRONG_FILE_TYPE, 5000,
                    Notification.Position.BOTTOM_END);
            notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
        });
    }


}
