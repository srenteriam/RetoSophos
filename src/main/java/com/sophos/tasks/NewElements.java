package com.sophos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.sophos.userinterfaces.ElementsPage.*;

public class NewElements implements Task {
    private List<String> dataElement;

    public NewElements(List<String> dataElement) {
        this.dataElement = dataElement;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ELEMENT_ONE),
                Click.on(WEB_TABLE),
                Click.on(ADD),
                Click.on(FIRST_NAME), Enter.theValue(dataElement.get(1)).into(FIRST_NAME).thenHit(Keys.TAB),
                Enter.theValue(dataElement.get(3)).into(LAST_NAME).thenHit(Keys.TAB),
                Enter.theValue(dataElement.get(5)).into(EMAIL).thenHit(Keys.TAB),
                Enter.theValue(dataElement.get(7)).into(AGE).thenHit(Keys.TAB),
                Enter.theValue(dataElement.get(9)).into(SALARY).thenHit(Keys.TAB),
                Enter.theValue(dataElement.get(11)).into(DEPARTMENT).thenHit(Keys.TAB).thenHit(Keys.ENTER),
                Click.on(DELETE)

        );
    }

    public static NewElements with(List<String> dataElement){
        return Tasks.instrumented(NewElements.class, dataElement);
    }

}
