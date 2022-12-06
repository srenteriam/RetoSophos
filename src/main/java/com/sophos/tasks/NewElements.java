package com.sophos.tasks;

import com.sophos.models.Element;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Map;

import static com.sophos.userinterfaces.ElementsPage.*;

public class NewElements implements Task {

    private DataTable data;

    private Map<String, String> information;

    private Element elements;

    public NewElements(DataTable data) {
        this.data = data;
        information = this.data.asMap(String.class, String.class);
        elements = new Element(information.get("First_Name"), information.get("Last_Name"), information.get("Email"), information.get("Age "), information.get("Salary "), information.get("Department"));
    }
        @Override
        public <T extends Actor> void performAs(T actor){
            actor.attemptsTo(
                    Click.on(ELEMENT_ONE),
                    Click.on(WEB_TABLE)

            );
        }























    public static NewElements with(DataTable data) { return Tasks.instrumented(NewElements.class, data);}
}
