package com.sophos.stepdefinitions;

import com.sophos.tasks.AddDate;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class WidgetsStepdefinitions {

    @Before
    public void setUp(){setTheStage(new OnlineCast());}

    @When("Seleccionar fechas {string} en los widgets")
    public void seleccionarFechasEnLosWidgets(String date) {
        theActorInTheSpotlight().attemptsTo(AddDate.with(date));
    }
}
