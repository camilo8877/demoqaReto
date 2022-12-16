package com.demoqa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.DefaultUrl;



public class Emergente extends PageObject {

    public static Performable accept(){
        return Task.where("Haga clic en un boton",
                actor -> BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept());
    }

    public static Performable cancel(){
        return Task.where("Aceptas o rechazas la accion?",
                actor -> BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss());
    }

    public static Performable Text(){
        return Task.where("Ingresa tu nombre aqui",
                actor -> BrowseTheWeb.as(actor).getDriver().switchTo().alert().sendKeys("Camilo Borja"));
    }
}
