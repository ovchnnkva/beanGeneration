package ru.sfedu.beanGenerator.parser;

import com.vaadin.flow.spring.annotation.SpringComponent;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import ru.sfedu.beanGenerator.antlr4.ActivityPumlLexer;
import ru.sfedu.beanGenerator.antlr4.ActivityPumlParser;
import ru.sfedu.beanGenerator.antlr4.DiagramListener;
import ru.sfedu.beanGenerator.model.Activity;
import ru.sfedu.beanGenerator.util.ContentFormattingUtil;

import java.util.ArrayList;
import java.util.List;

@SpringComponent
@Slf4j
@AllArgsConstructor
public class PumlParser {

    private final DiagramListener listener;

    public List<Activity> getActivities(String inputDiagramDesc) {
        startParsing(inputDiagramDesc);

        return listener.getActivities();
    }

    private void startParsing(String inputStr) {
        CharStream strStream = CharStreams.fromString(ContentFormattingUtil.removeLineFeeds(inputStr));
        ActivityPumlLexer lexer = new ActivityPumlLexer(strStream);
        ActivityPumlParser parser = new ActivityPumlParser(new CommonTokenStream(lexer));
        parser.addParseListener(listener);
        parser.activityDiagram();

        log.info("content: {}", inputStr);
    }

    public void clear() {
        listener.setActivities(new ArrayList<>());
    }
}
