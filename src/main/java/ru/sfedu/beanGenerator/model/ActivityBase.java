package ru.sfedu.beanGenerator.model;

import lombok.*;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

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
public class ActivityBase implements Activity {
    private String name;
    private String content;
    private Map<String, String> atributes;

    public void addAtribute(String name, String value) {
        atributes.put(name, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActivityBase that = (ActivityBase) o;
        return Objects.equals(name, that.name) && Objects.equals(content, that.content) && Objects.equals(atributes, that.atributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, content, atributes);
    }
}
