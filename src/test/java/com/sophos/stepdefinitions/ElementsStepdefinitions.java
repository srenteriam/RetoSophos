package com.sophos.stepdefinitions;

import com.sophos.tasks.NewElements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ElementsStepdefinitions {

    @Before
    public void setUp(){setTheStage(new OnlineCast());}

    @Given("{string} Desea navegar a la pagina {string}")
    public void deseaNavegarAlaPagina(String actor, String url){
        theActorCalled(actor).attemptsTo(Open.url(url));
    }

    @When("Crear un nuevo registro en Web tables")
    public void crearUnNuevoRegistroEnWebTables(DataTable datosRegistro){
        theActorInTheSpotlight().attemptsTo(NewElements.with(datosRegistro));
    }
}
