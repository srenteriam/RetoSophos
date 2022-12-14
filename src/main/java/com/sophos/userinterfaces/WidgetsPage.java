package com.sophos.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class WidgetsPage extends PageObject {

    public static final Target WIDGETSONE = Target.the("Boton Widgets")
            .locatedBy("(//*[@class='card-up'])[4]");

    public static final Target DATEPICKER = Target.the("Boton Date picker")
            .locatedBy("//span[contains(text(),'Date Picker')]");

    public static final Target DATE = Target.the("Boton de Fecha")
            .locatedBy("(//*[@id='datePickerMonthYearInput'])");

    public static final Target DATEANDTIME = Target.the("Boton de Fecha y Hora")
            .locatedBy("(//*[@id='dateAndTimePickerInput'])");


}
