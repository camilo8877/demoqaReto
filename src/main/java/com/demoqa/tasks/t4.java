package com.demoqa.tasks;

import com.demoqa.userinterfaces.alertFrame;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class t4 implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(alertFrame.PROMPT)
        );
    }
    public static t4 t4(){return Tasks.instrumented(t4.class);}
}
