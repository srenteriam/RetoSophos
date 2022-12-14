package com.sophos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AlertsPage {

    public static final Target ALERTS_FRAME_WINDOWS = Target.the("Boton Alerts, Frame and Windows")
            .locatedBy("(//*[@class='card-up'])[3]");

    public static final Target ALERTS = Target.the("Boton Alerts")
            .locatedBy("//span[contains(text(),'Alerts')]");
}
