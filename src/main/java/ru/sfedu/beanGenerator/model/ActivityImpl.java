package ru.sfedu.beanGenerator.model;

import lombok.*;

import java.util.Map;

/**
 * Сущность активности.
 * В name записывается название активности act_name_(1..n)
 * В content тело активности
 * в atributes возможные атрибуты вида ATRIBUTE_NAME/ATRIBUTE_CONTENT
 */
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
public class ActivityImpl implements Activity {
    private String name;
    private String content;
    private Map<String, String> atributes;

    public void addAtribute(String name, String value) {
        atributes.put(name, value);
    }
}
