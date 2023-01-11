package com.sophos.stepdefinitions;

import com.sophos.abilities.ReadFile;
import com.sophos.questions.ValidateText;
import com.sophos.tasks.NewElements;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static com.sophos.userinterfaces.ElementsPage.NAME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class ElementsStepdefinitions {


    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
    }

    @Given("{string} Desea navegar a la pagina {string}")
    public void deseaNavegarAlaPagina(String actor, String url) {
        theActorCalled(actor).attemptsTo(Open.url(url));
    }

    @When("Crear un nuevo registro en Web tables")
    public void crearUnNuevoRegistroEnWebTables() throws IOException {
        String[] data = ReadFile.as(theActorInTheSpotlight()).getData();
        List<String> dataElement = Arrays.stream(data).toList();
        theActorInTheSpotlight().attemptsTo(NewElements.with(dataElement));

    }

    @Then("Valida que se creo el registro {string}")
    public void validaQueSeCreoElRegistro(String text) {
        theActorInTheSpotlight().should(seeThat(ValidateText.with(NAME, text), equalTo(text)));
    }


}
