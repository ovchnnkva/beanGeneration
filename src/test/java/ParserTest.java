
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sfedu.beanGenerator.antlr4.ActivityPumlLexer;
import ru.sfedu.beanGenerator.antlr4.ActivityPumlParser;
import ru.sfedu.beanGenerator.antlr4.DiagramListener;
import ru.sfedu.beanGenerator.model.Activity;
import ru.sfedu.beanGenerator.model.ActivityBase;
import ru.sfedu.beanGenerator.model.ActivityWithCondition;
import ru.sfedu.beanGenerator.parser.PumlParser;
import ru.sfedu.beanGenerator.util.ContentFormattingUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
public class ParserTest {
    private static PumlParser parser;
    @BeforeAll
    public static void init() {
        parser = new PumlParser(new DiagramListener());
    }

    @Test
    public void parseSimpleActivityDiagramText() {
        String simpleText = "@startuml\n" +
                "start\n" +
                ":Привет мир!;\n" +
                ":Эта активность описывается \n" +
                "несколькими **строчками** текста;\n" +
                "stop\n" +
                "@enduml\n";
        List<Activity> activity = parser.getActivities(simpleText);

        assertEquals(activity.size(), 2);
        assertTrue(activity.contains(new ActivityBase("act_num_1", "Привет мир!", new HashMap<>())));
        assertTrue(activity.contains(new ActivityBase("act_num_2", "Эта активность описывается несколькими **строчками** текста", new HashMap<>())));
    }

    @Test
    public void parseActivityDiagramWithAtributes() {
        String textWithAtributes =
                """
                        @startuml
                        start
                        :ACT_DESC:Создать инстанс esia контракта
                        ACT_NAME:esia_new_ctr
                        PARAMS:{spot_contract};
                        fork
                        :ACT_DESC:Установка фильтров
                        ACT_NAME:esia_set_fltr
                        PARAMS:{esiacontract};
                        end fork
                        fork
                        :ACT_DESC:Установка лимитов
                        ACT_NAME:esia_set_lmt
                        PARAMS:{esiacontract};
                        end fork
                        :ACT_DESC:Расчет индиктора
                        ACT_NAME:esia_calc_idr;
                        stop
                        @enduml""";
        List<Activity> activity = parser.getActivities(textWithAtributes);

        assertEquals(activity.size(), 4);
        assertTrue(activity.contains(new ActivityBase("act_num_1", "", Map.of("ACT_DESC", "Создать инстанс esia контракта",
                "PARAMS", "{spot_contract}", "ACT_NAME", "esia_new_ctr"))));
        assertTrue(activity.contains(new ActivityBase("act_num_2", "", Map.of("ACT_DESC", "Установка фильтров",
                "PARAMS", "{esiacontract}", "ACT_NAME", "esia_set_fltr"))));
        assertTrue(activity.contains(new ActivityBase("act_num_3", "", Map.of("ACT_DESC", "Установка лимитов",
                "PARAMS", "{esiacontract}", "ACT_NAME", "esia_set_lmt"))));
        assertTrue(activity.contains(new ActivityBase("act_num_4", "", Map.of("ACT_DESC", "Расчет индиктора",
                "ACT_NAME", "esia_calc_idr"))));
    }

    @Test
    public void activitiesWithCondition() {
        String textWithCondition = "\t\n" +
                "@startuml\n" +
                "if (счетчик?) is (5) then\n" +
                ":пачатаем \"5\";\n" +
                "else\n" +
                ":печатаем \"НЕ 5\";\n" +
                "endif\n" +
                "@enduml";
        List<Activity> activity = parser.getActivities(textWithCondition);

        assertEquals(activity.size(), 1);
        assertTrue(activity.contains(new ActivityWithCondition(Map.of("5", "пачатаем 5"), Map.of("else", "печатаем НЕ 5"), "счетчик?", "act_num_1")));
    }
}
