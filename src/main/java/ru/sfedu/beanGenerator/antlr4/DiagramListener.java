package ru.sfedu.beanGenerator.antlr4;

import com.vaadin.flow.spring.annotation.SpringComponent;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import ru.sfedu.beanGenerator.model.Activity;
import ru.sfedu.beanGenerator.model.ActivityImpl;
import ru.sfedu.beanGenerator.model.ActivityWithCondition;
import ru.sfedu.beanGenerator.util.ContentFormattingUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Setter
@Slf4j
@Getter
@SpringComponent
public class DiagramListener implements ActivityPumlListener {
    private List<Activity> activities = new ArrayList<>();
    private static final String NAME_PREFIX = "act_num_";

    @Override
    public void enterAtribute(ActivityPumlParser.AtributeContext ctx) {

    }

    @Override
    public void exitAtribute(ActivityPumlParser.AtributeContext ctx) {
    }

    @Override
    public void enterNote(ActivityPumlParser.NoteContext ctx) {

    }

    @Override
    public void exitNote(ActivityPumlParser.NoteContext ctx) {

    }

    @Override
    public void enterActivity(ActivityPumlParser.ActivityContext ctx) {
    }

    @Override
    public void exitActivity(ActivityPumlParser.ActivityContext ctx) {
        ActivityPumlParser.AtributeContext atribute = ctx.atribute();

        if(atribute == null) return;

        ActivityImpl activity = ActivityImpl.builder()
                .name(NAME_PREFIX + (activities.size() + 1))
                .content((atribute.ATRIBUTE_KEY() == null || atribute.ATRIBUTE_KEY().isEmpty())
                        ? String.valueOf(ctx.atribute().ATRIBUTE_CONTENT(0).getText())
                        : "")
                .atributes(new HashMap<>())
                .build();


        if(ctx.atribute().ATRIBUTE_KEY() != null){
            for(int i = 0; i < ctx.atribute().ATRIBUTE_KEY().size(); i++) {
                activity.addAtribute(ContentFormattingUtil.formatActivityKey(String.valueOf(ctx.atribute().ATRIBUTE_KEY(i).getText())),
                                     String.valueOf(ctx.atribute().ATRIBUTE_CONTENT(i).getText()));
            }
        }

        activities.add(activity);

        log.info("find activity bean {}", activity.toString());
    }

    @Override
    public void enterIfCondition(ActivityPumlParser.IfConditionContext ctx) {
        log.info("find ifCond {}", ctx.getText());
    }

    @Override
    public void exitIfCondition(ActivityPumlParser.IfConditionContext ctx) {
    }

    @Override
    public void enterElseCondition(ActivityPumlParser.ElseConditionContext ctx) {

    }

    @Override
    public void exitElseCondition(ActivityPumlParser.ElseConditionContext ctx) {

    }

    @Override
    public void enterActivityDiagram(ActivityPumlParser.ActivityDiagramContext ctx) {

    }

    @Override
    public void exitActivityDiagram(ActivityPumlParser.ActivityDiagramContext ctx) {

    }

    @Override
    public void enterActivityWithCondition(ActivityPumlParser.ActivityWithConditionContext ctx) {
    }

    @Override
    public void exitActivityWithCondition(ActivityPumlParser.ActivityWithConditionContext ctx) {
        ActivityWithCondition activityWithCondition = new ActivityWithCondition(NAME_PREFIX + (activities.size() + 1));
        ActivityPumlParser.IfConditionContext ifCondition = ctx.ifCondition();
        List<ActivityPumlParser.ElseConditionContext> elseCondition = ctx.elseCondition();

        activityWithCondition.setCondition(ContentFormattingUtil.formatCondition(ctx.ifCondition().BRANCH_VAL(0).toString()));

        if(ifCondition.atribute() != null) {
            activityWithCondition.setIfCondition(Map.of(ContentFormattingUtil.formatActivityKey(ifCondition.BRANCH_VAL(1).getText()),
                    ContentFormattingUtil.formatCondition(ifCondition.atribute().ATRIBUTE_CONTENT().get(0).getText())));

            Map<String, String> elseConditions = new HashMap<>();

            elseCondition.forEach(c -> elseConditions.put(
                    c.BRANCH_VAL() != null
                            ? ContentFormattingUtil.formatActivityKey(c.BRANCH_VAL().getText())
                            : "else",

                    ContentFormattingUtil.formatCondition(c.atribute().ATRIBUTE_CONTENT().get(0).getText())
            ));

            activityWithCondition.setElseCondition(elseConditions);
        }

        log.info(activityWithCondition.toString());

        activities.add(activityWithCondition);
    }

    @Override
    public void enterTitle(ActivityPumlParser.TitleContext ctx) {

    }

    @Override
    public void exitTitle(ActivityPumlParser.TitleContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
