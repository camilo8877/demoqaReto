package com.demoqa.tasks;

import com.demoqa.userinterfaces.elements;
import com.demoqa.userinterfaces.home;
import com.demoqa.userinterfaces.registerForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class registerTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(home.Elements),
                Click.on(elements.Webtable),
                Click.on(elements.add),
                SendKeys.of("Cristian").into(registerForm.FIRSTNAME),
                SendKeys.of("Borja").into(registerForm.LASTNAME),
                SendKeys.of("camilo8877@gmail.com").into(registerForm.EMAIL),
                SendKeys.of("30").into(registerForm.AGE),
                SendKeys.of("2000000").into(registerForm.SALARY),
                SendKeys.of("Administración").into(registerForm.DEPARTMENT),
                Click.on(registerForm.SUBMIT),
                Click.on(elements.eraseone),
                Click.on(elements.erasetwo),
                Click.on(elements.erasethree),
                Click.on(elements.erasefour)





        );
    }
    public static registerTask makeinformation(){
        return instrumented(registerTask.class);
    }
}
