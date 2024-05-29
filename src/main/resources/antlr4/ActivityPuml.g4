grammar ActivityPuml;
activityDiagram         :   title?
                            START_UML
                            START?
                            note*
                            activityWithCondition*
                            activityBase*
                            END?
                            END_UML;

activityBase            :   FORK_START?
                            activityBody
                            FORK_END?;

activityWithCondition   :   ifCondition
                            elseCondition*
                            ENDIF;

ifCondition             :   IF BRANCH_VAL (' is ' BRANCH_VAL)? ' then'
                                activityBody;
elseCondition           :   ELSE BRANCH_VAL?
                                activityBody;

activityBody            :   ATRIBUTE_START
                            (ATRIBUTE_KEY? ATRIBUTE_CONTENT)+
                            ATRIBUTE_END;


note                    :   NOTE_START
                            ATRIBUTE_CONTENT
                            NOTE_END;

title                   :   TITLE ATRIBUTE_CONTENT;

TITLE                   :   'title ';
ELSE                    :   'else';
IF                      :   'if ';
IS                      :   ' is ';
THEN                    :   ' then ';
ENDIF                   :   'endif';
BRACKET                 :   [()];
START_UML               :   '@startuml';
START                   :   'start';
FORK_START              :   'fork';
FORK_END                :   'end fork';
NOTE_START              :   'note' ('right' || 'left')?;
NOTE_END                :   'end note';
END                     :   ('stop' | 'end' | 'kill' | 'detach');
END_UML                 :   '@enduml';
BRANCH_VAL              :   '(' ATRIBUTE_CONTENT ')';
ATRIBUTE_KEY            :   [A-Z_]+ ':';
ATRIBUTE_START          :   ':';
ATRIBUTE_END            :   ';';
ATRIBUTE_CONTENT        :   [а-яА-Яa-z0-9!,.\u0022*_?{}\u002D\u003E ]+;
WS                      :   [\n\t\r ] -> skip;





