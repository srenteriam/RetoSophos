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



    @When("Seleccionar fecha {string} y seleccionar hora y fecha {string}")
    public void seleccionarFechaYSeleccionarHoraYFecha(String date, String dateTime) {theActorInTheSpotlight().attemptsTo(AddDate.with(date,dateTime));
    }
}
