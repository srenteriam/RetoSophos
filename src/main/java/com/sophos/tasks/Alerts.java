package com.sophos.tasks;

import com.sophos.userinterfaces.AlertsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeystoElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.SendKeys;


public class Alerts implements Task {

private String name;


public Alerts(String name){
        this.name = name;
        }

@Override
public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AlertsPage.ALERTS_FRAME_WINDOWS),
                Click.on(AlertsPage.ALERTS),
                Click.on(AlertsPage.ALERTS_ONE)


                //Enter.keyValues()
                //Hit.the(Keys.ENTER).into(BY)



        );


        }



public static Alerts with(String name){
        return Tasks.instrumented(Alerts.class, name);
        }


}
