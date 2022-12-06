package com.sophos.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ElementsPage extends PageObject {

    public static final Target ELEMENT_ONE = Target.the("Boton elements")
            .locatedBy("(//*[@class='card-up'])[1]");

    public static final Target WEB_TABLE = Target.the("Boton Web table")
            .locatedBy("//span[contains(text(),'Tables')]");
}
