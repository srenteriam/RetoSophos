package com.sophos.stepdefinitions;

import com.sophos.tasks.Alerts;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AlertsStepdefinitions {

    @Before
    public void setUp(){setTheStage(new OnlineCast());}

    @When("Probar las alertas y agregar el nombre {string}")
    public void probarLasAlertasYAgregarElNombre(String name) {
        theActorInTheSpotlight().attemptsTo(Alerts.with(name));
    }
}
