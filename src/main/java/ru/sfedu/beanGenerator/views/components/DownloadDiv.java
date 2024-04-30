package ru.sfedu.beanGenerator.views.components;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.spring.annotation.SpringComponent;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static ru.sfedu.beanGenerator.util.FileUtil.FILE_PATH;

@SpringComponent
@Slf4j
public class DownloadDiv extends Div {
    private H3 title;
    private Anchor link;
    private String fileName;

    public void addLinkToFile(File file) {
        fileName = file.getName();
        StreamResource streamResource = new StreamResource(fileName, () -> getStream(file));
        link = new Anchor(streamResource, String.format("%s (%d KB)", fileName,
                (int) file.length() / 1024));
        link.getElement().setAttribute("download", true);

        title = new H3("Скачать");

        this.add(title);
        this.add(link);
    }

    public void clear() {
        Path path = Path.of(String.format(FILE_PATH, fileName));
        try{
            Files.delete(path);
        } catch (IOException e) {
            log.error("file delete error " + e.getLocalizedMessage());
        }
        this.removeAll();
    }

    private InputStream getStream(File file) {
        FileInputStream stream = null;
        try {
            stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            log.error(e.getLocalizedMessage());
        }

        return stream;
    }
}
