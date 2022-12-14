package com.sophos.tasks;

import com.sophos.userinterfaces.AlertsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Alerts implements Task {

private String name;


public Alerts(String name){
        this.name = name;
        }

@Override
public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AlertsPage.ALERTS_FRAME_WINDOWS),
                Click.on(AlertsPage.ALERTS)


        );

        }



public static Alerts with(String name){
        return Tasks.instrumented(Alerts.class, name);
        }


}
