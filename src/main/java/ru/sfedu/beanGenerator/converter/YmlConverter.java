package ru.sfedu.beanGenerator.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.vaadin.flow.spring.annotation.SpringComponent;
import lombok.extern.slf4j.Slf4j;
import ru.sfedu.beanGenerator.model.Activity;

import java.util.List;
import java.util.stream.Collectors;

@SpringComponent
@Slf4j
public class YmlConverter {

    private final ObjectMapper mapper;

    private YmlConverter() {
        mapper = new ObjectMapper(new YAMLFactory());
    }

    public List<String> getYamlString(List<Activity> activity) {
        return activity.stream()
               .map(a -> {
                    try {
                        return mapper.writeValueAsString(a);
                    } catch (JsonProcessingException e) {
                        log.error("getYamlString \n" + e.getMessage());
                    }
                    return "";
               })
               .collect(Collectors.toList());
    }
}
