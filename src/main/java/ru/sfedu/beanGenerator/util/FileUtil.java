package ru.sfedu.beanGenerator.util;

import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Slf4j
public class FileUtil {
    public final static String FILE_PATH = "./src/main/resources/files/%s";

    public static String getStringFromBuffer(MemoryBuffer buffer) {
        InputStream inputStream = buffer.getInputStream();
        String inputStr = "";
        try {
            inputStr = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
            inputStream.close();
        } catch (IOException e) {
            log.error("getStringFromBuffer error " + e.getLocalizedMessage());
        }

        return inputStr;
    }

    public static File getFileWithStringContent(List<String> fileContent, String fileName) {
        File file = new File(String.format(FILE_PATH, replaceFileExtension(fileName)));
        try {
            file.createNewFile();
            FileOutputStream outputStream = new FileOutputStream(file);
            outputStream.write(String.join("\n", fileContent).getBytes());
            outputStream.close();
            file.deleteOnExit();
        } catch(IOException e) {
            log.error("getYamlFile \n" + e.getMessage());
        }

        return file;
    }

    private static String replaceFileExtension(String fileName) {
        return fileName.replaceFirst(".puml", ".yaml");
    }
}
