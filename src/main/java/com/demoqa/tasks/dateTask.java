package com.demoqa.tasks;


import com.demoqa.userinterfaces.datePicker;
import com.demoqa.userinterfaces.widgets;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class dateTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(widgets.WIDGET),
                Click.on(widgets.DATE_PICKER),
                Click.on(datePicker.SELECTDATE),
                Click.on(datePicker.FECHA),
                Click.on(datePicker.DATE_TIME),
                Click.on(datePicker.SECONDFECHA),
                Click.on(datePicker.HOUR)
        );
    }
    public static dateTask makeinformation(){return instrumented (dateTask.class);}
}
