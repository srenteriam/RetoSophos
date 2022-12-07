package com.sophos.tasks;

import com.sophos.userinterfaces.WidgetsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddDate implements Task {

    private String date;

    public AddDate(String date){this.date = date;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WidgetsPage.WIDGETS_ONE)
        );

    }



    public static AddDate with(String date){
        return Tasks.instrumented(AddDate.class, date);
    }

}
