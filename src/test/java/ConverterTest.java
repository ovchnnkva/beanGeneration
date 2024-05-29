import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sfedu.beanGenerator.antlr4.DiagramListener;
import ru.sfedu.beanGenerator.converter.YmlConverter;
import ru.sfedu.beanGenerator.model.Activity;
import ru.sfedu.beanGenerator.model.ActivityBase;
import ru.sfedu.beanGenerator.model.ActivityWithCondition;
import ru.sfedu.beanGenerator.parser.PumlParser;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
public class ConverterTest {
    private static YmlConverter converter;
    @BeforeAll
    public static void init() {
        converter = new YmlConverter();
    }


    @Test
    public void activitiesWithCondition() {
        ActivityBase activityBaseNum1 = new ActivityBase("act_num_1", "", Map.of("ACT_DESC", "Создать инстанс esia контракта",
                "PARAMS", "{spot_contract}", "ACT_NAME", "esia_new_ctr"));
        ActivityBase activityBaseNum2 = new ActivityBase("act_num_2", "", Map.of("ACT_DESC", "Установка фильтров",
                "PARAMS", "{esiacontract}", "ACT_NAME", "esia_set_fltr"));


        String[] expectedActivities = converter.getYamlString(List.of(activityBaseNum1, activityBaseNum2)).split("---");

        assertTrue(expectedActivities[1].contains("name: \"act_num_1\""));
        assertTrue(expectedActivities[1].contains("content: \"\""));
        assertTrue(expectedActivities[1].contains("atributes:"));
        assertTrue(expectedActivities[1].contains("PARAMS: \"{spot_contract}\""));
        assertTrue(expectedActivities[1].contains("ACT_NAME: \"esia_new_ctr\""));
        assertTrue(expectedActivities[1].contains("ACT_DESC: \"Создать инстанс esia контракта\""));

        assertTrue(expectedActivities[2].contains("name: \"act_num_2\""));
        assertTrue(expectedActivities[2].contains("content: \"\""));
        assertTrue(expectedActivities[2].contains("atributes:"));
        assertTrue(expectedActivities[2].contains("PARAMS: \"{esiacontract}\""));
        assertTrue(expectedActivities[2].contains("ACT_NAME: \"esia_set_fltr\""));
        assertTrue(expectedActivities[2].contains("ACT_DESC: \"Установка фильтров\""));
    }
}
