package com.sophos.stepdefinitions;

import com.sophos.questions.ValidateText;
import com.sophos.tasks.Alerts;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.By;

import static com.sophos.userinterfaces.AlertsPage.NAME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.hamcrest.Matchers.equalTo;

public class AlertsStepdefinitions {

    @Before
    public void setUp(){setTheStage(new OnlineCast());}

    @When("Probar las alertas y agregar el nombre {string}")
    public void probarLasAlertasYAgregarElNombre(String name) throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(Alerts.with(name));
        getDriver().switchTo().alert().accept();
        getDriver().findElement(By.id("timerAlertButton")).click();
        Thread.sleep(6000);
        getDriver().switchTo().alert().accept();
        getDriver().findElement(By.id("confirmButton")).click();
        getDriver().switchTo().alert().accept();
        getDriver().findElement(By.id("promtButton")).click();
        getDriver().switchTo().alert().sendKeys(name);
        getDriver().switchTo().alert().accept();

    }

    @Then("Valida que se ingreso el texto {string}")
    public void validaQueSeIngresoElTexto(String text){
        theActorInTheSpotlight().should(seeThat(ValidateText.with(NAME,text),equalTo("You entered " + text)));
    }
}
