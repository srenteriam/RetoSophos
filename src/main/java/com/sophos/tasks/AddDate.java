package com.sophos.tasks;

import com.sophos.userinterfaces.WidgetsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class AddDate implements Task {

    private String date;

    private String dateTime;

    public AddDate(String date, String dateTime){
        this.date = date;
        this.dateTime = dateTime;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WidgetsPage.WIDGETS_ONE),
                Click.on(WidgetsPage.DATEPICKER),
                Clear.field(WidgetsPage.DATE),
                Enter.theValue(date).into(WidgetsPage.DATE).thenHit(Keys.ENTER),
                Clear.field(WidgetsPage.DATEANDTIME),
                Enter.theValue(dateTime).into(WidgetsPage.DATEANDTIME).thenHit(Keys.ENTER)
        );

    }



    public static AddDate with(String date, String dateTime){
        return Tasks.instrumented(AddDate.class, date, dateTime);
    }

}
