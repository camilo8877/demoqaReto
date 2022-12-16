package com.demoqa.stepdefinitions;

import com.demoqa.tasks.*;
import com.demoqa.userinterfaces.Emergente;
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
import net.thucydides.core.webdriver.WebdriverManager;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class alertstepdefinitions {

    //@Managed(driver = "chrome")
    //WebDriver driver;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        WebDriverManager.chromedriver().setup();
        //OnStage.theActorCalled("Cristian");
    }
    @Given("^Cristian ingresa a la opcion Alerts,Frame & Windows$")
    public void cristianIngresaALaOpcionAlertsFrameWindows() {
    //{theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/"));}
        theActorCalled("Cristian").attemptsTo(Open.browserOn(new home()));
    }

    @When("^Interactua con cuatro ventanas emergentes$")
    public void interactuaConCuatroVentanasEmergentes() {theActorInTheSpotlight().attemptsTo(alertTask.makeinformation());
    }

    @Then("^Las activa y cierra segun sus condiciones$")
    public void lasActivaYCierraSegunSusCondiciones() throws InterruptedException{
        theActorInTheSpotlight().attemptsTo(t1.t1());
        theActorInTheSpotlight().attemptsTo(Emergente.accept());
        theActorInTheSpotlight().attemptsTo(t2.t2());
        Thread.sleep(8000);
        theActorInTheSpotlight().attemptsTo(Emergente.accept());
        theActorInTheSpotlight().attemptsTo(t3.t3());
        theActorInTheSpotlight().attemptsTo(Emergente.cancel());
        theActorInTheSpotlight().attemptsTo(t4.t4());
        theActorInTheSpotlight().attemptsTo(Emergente.Text());
        theActorInTheSpotlight().attemptsTo(Emergente.accept());
        Thread.sleep(5000);
    }
}
