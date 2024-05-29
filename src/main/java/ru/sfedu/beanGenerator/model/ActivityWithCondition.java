package ru.sfedu.beanGenerator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;
import java.util.Objects;

/**
 * Активность с уловием
 * ifCondition содержит имя отвлетления для условия if и действие внутри условия.
 * Имя отвлетления может быть пустым.
 * аналогично для elseCondition
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
public class ActivityWithCondition implements Activity {
    private Map<String, String> ifCondition;
    private Map<String, String> elseCondition;
    private String condition;
    private String name;

    public ActivityWithCondition(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActivityWithCondition that = (ActivityWithCondition) o;
        return Objects.equals(ifCondition, that.ifCondition) && Objects.equals(elseCondition, that.elseCondition) && Objects.equals(condition, that.condition) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ifCondition, elseCondition, condition, name);
    }
}
