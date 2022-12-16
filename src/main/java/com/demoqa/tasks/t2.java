package com.demoqa.tasks;

import com.demoqa.userinterfaces.alertFrame;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class t2 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(alertFrame.ALERT5S)
        );
    }
    public static t2 t2(){ return Tasks.instrumented(t2.class);
    }
}
