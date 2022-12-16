package com.demoqa.stepdefinitions;

import com.demoqa.tasks.dateTask;
import com.demoqa.userinterfaces.alertFrame;
import com.demoqa.userinterfaces.home;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class datestepdefinitions {
    //@Managed(driver="chrome")
    //WebDriver driver;

    @Before
    public void setTheStage(){
        OnStage.setTheStage( new OnlineCast());
        WebDriverManager.chromedriver().setup();
        //OnStage.theActorCalled("Cristian");
    }
    @Given("^Cristian quiere ir a la opcion Widgets en Date picker$")
    public void cristianQuiereIrALaOpcionWidgetsEnDatePicker(){
    //{theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/"));}
        theActorCalled("Cristian").attemptsTo(Open.browserOn(new home()));
    }


    @When("^Seleccionar una fecha y fecha y hora$")
    public void seleccionarUnaFechaYFechaYHora() {theActorInTheSpotlight().attemptsTo((dateTask.makeinformation()));
    }

    @Then("^Se definen las fechas$")
    public void seDefinenLasFechas() {
    }
}
