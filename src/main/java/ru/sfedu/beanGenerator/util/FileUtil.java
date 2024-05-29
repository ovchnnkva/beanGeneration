package ru.sfedu.beanGenerator.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static ru.sfedu.beanGenerator.constants.ExtensionsConstant.PUML_EXTENSION;
import static ru.sfedu.beanGenerator.constants.PathConstant.FILE_PATH_FORMAT;

@Slf4j
public class FileUtil {

    public static String getFileContent(String fileName) {
        File file = new File(String.format(FILE_PATH_FORMAT, fileName));
        String inputStr = "";
        try {
            FileInputStream inputStream = new FileInputStream(file);
            inputStr = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
            inputStream.close();
        } catch (IOException e) {
            log.error("getFileContent error " + e.getLocalizedMessage());
        }

        return inputStr;
    }

    public static void saveFile(InputStream inputStream, String fileName) {
        File file = new File(String.format(FILE_PATH_FORMAT, fileName));
        String inputStr;
        try {
            inputStr = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
            inputStream.close();

            file.createNewFile();
            FileOutputStream outputStream = new FileOutputStream(file);
            outputStream.write(inputStr.getBytes());
            outputStream.close();
            file.deleteOnExit();
            log.info("save file " + fileName);
        } catch (IOException e) {
            log.error("getFileContent error " + e.getLocalizedMessage());
        }

    }

    public static File getFile(String fileName) {
        return new File(String.format(FILE_PATH_FORMAT, fileName));
    }

    public static void deleteFile(String fileName) {
        Path path = Path.of(String.format(FILE_PATH_FORMAT, fileName));
        try{
            Files.delete(path);
        } catch (IOException e) {
            log.error("file delete error " + e.getLocalizedMessage());
        }
    }

    public static String replaceFileExtension(String fileName, String newExtension) {
        return fileName.replaceFirst(PUML_EXTENSION, newExtension);
    }

    public static InputStream getInputStream(String string) {
        return new ByteArrayInputStream(string.getBytes(StandardCharsets.UTF_8));
    }
}
