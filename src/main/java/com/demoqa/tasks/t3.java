package com.demoqa.tasks;

import com.demoqa.userinterfaces.alertFrame;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class t3 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(alertFrame.CONFIRM)
       );
    }
    public static t3 t3(){return Tasks.instrumented(t3.class);
    }
}
