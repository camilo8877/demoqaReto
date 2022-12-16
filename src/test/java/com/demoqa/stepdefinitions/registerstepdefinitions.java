package com.demoqa.stepdefinitions;

import com.demoqa.tasks.registerTask;
import com.demoqa.userinterfaces.alertFrame;
import com.demoqa.userinterfaces.home;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import cucumber.api.PendingException;
import net.serenitybdd.screenplay.actions.ClickOnElement;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class registerstepdefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        WebDriverManager.chromedriver().setup();
        //OnStage.theActorCalled("Cristian");
    }
    @Given("^Cristian quiere ir a la pagina de url$")
    public void cristianQuiereIrALaPaginaDeUrl() {
        {
            theActorCalled("Cristian").attemptsTo(Open.browserOn(new home()));
            //theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/"))
        }
    }

    @When("^Agregar un nuevo registro con datos de usuario y usuario nuevo$")
    public void agregarUnNuevoRegistroConDatosDeUsuarioYUsuarioNuevo() {
        theActorInTheSpotlight().attemptsTo(registerTask.makeinformation());
    }

    @Then("^Se valida que el usuario se cree exitosamente$")
    public void seValidaQueElUsuarioSeCreeExitosamente() {
    }


}
