package com.demoqa.tasks;

import com.demoqa.userinterfaces.alertFrame;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class alertTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(alertFrame.ALERT_FRAME_WINDOWS),
                Click.on(alertFrame.ALERT)
//                Click.on(alertFrame.SEE_ALERT),
//                Click.on(alertFrame.ALERT5S),
//                Click.on(alertFrame.CONFIRM),
//                Click.on(alertFrame.PROMPT)

        );
    }
    public static alertTask makeinformation(){return instrumented(alertTask.class);}
}
