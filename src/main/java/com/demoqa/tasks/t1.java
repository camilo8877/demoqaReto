package com.demoqa.tasks;

import com.demoqa.userinterfaces.alertFrame;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Task;


public class t1 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(alertFrame.SEE_ALERT)
        );
    }
    public static t1 t1(){ return Tasks.instrumented(t1.class);
    }
}
