package ru.sfedu.beanGenerator.util;

import lombok.extern.slf4j.Slf4j;
import net.sourceforge.plantuml.GeneratedImage;
import net.sourceforge.plantuml.SourceFileReader;

import java.io.File;
import java.util.List;
import java.util.Optional;

import static ru.sfedu.beanGenerator.util.FileUtil.getInputStream;
import static ru.sfedu.beanGenerator.util.FileUtil.saveFile;

@Slf4j
public class PlantUMLDiagramUtil {
    public static Optional<File> createDiagramPng(File file) {
        try {
            SourceFileReader reader = new SourceFileReader(file);
            List<GeneratedImage> list = reader.getGeneratedImages();
            Optional<File> fileOptional = Optional.ofNullable(list.get(0).getPngFile());
            fileOptional.ifPresent(f -> saveFile(getInputStream(f.toString()), f.getName()));
            return fileOptional;
        } catch (Exception e) {
            log.error("diagram create error " + e.getLocalizedMessage());
        }
        return null;
    }
}
