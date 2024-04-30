package ru.sfedu.beanGenerator.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

/**
 * Активность с уловием
 * ifCondition содержит имя отвлетления для условия if и действие внутри условия.
 * Имя отвлетления может быть пустым.
 * аналогично для elseCondition
 */
@Setter
@Getter
@ToString
public class ActivityWithCondition implements Activity {
    private Map<String, String> ifCondition;
    private Map<String, String> elseCondition;
    private String condition;
    private String name;

    public ActivityWithCondition(String name) {
        this.name = name;
    }
}
