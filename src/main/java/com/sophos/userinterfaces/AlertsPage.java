package com.sophos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AlertsPage {

    public static final Target ALERTS_FRAME_WINDOWS = Target.the("Boton Alerts, Frame and Windows")
            .locatedBy("(//*[@class='card-up'])[3]");

    public static final Target ALERTS = Target.the("Boton Alerts")
            .locatedBy("//span[contains(text(),'Alerts')]");

    public static final Target ALERTS_ONE = Target.the("Boton Alerts One")
            .locatedBy("(//*[@id='alertButton'])");

    public static final Target ALERTS_TWO = Target.the("Boton Alerts Two")
            .locatedBy("(//*[@id='timerAlertButton'])");

    public static final Target ALERTS_THREE = Target.the("Boton Alerts Three")
            .locatedBy("(//*[@id='confirmButton'])");

    public static final Target ALERTS_FOUR = Target.the("Boton Alerts Three")
            .locatedBy("(//*[@id='promtButton'])");

    public static final Target NAME = Target.the("Nombre")
            .locatedBy("//*[contains(text(), '{0}')]");


}
