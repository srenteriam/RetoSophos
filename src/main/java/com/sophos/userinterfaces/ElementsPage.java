package com.sophos.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ElementsPage extends PageObject {

    public static final Target ELEMENT_ONE = Target.the("Boton elements")
            .locatedBy("(//*[@class='card-up'])[1]");

    public static final Target WEB_TABLE = Target.the("Boton Web table")
            .locatedBy("//span[contains(text(),'Tables')]");

    public static final Target ADD = Target.the("Boton Add")
            .locatedBy("//*[@id='addNewRecordButton']");

    public static final Target FIRST_NAME = Target.the("Agregar nombre")
            .locatedBy("//*[@id='firstName']");

    public static final Target LAST_NAME = Target.the("Agregar apellido")
            .locatedBy("//*[@id='lastName']");

    public static final Target EMAIL = Target.the("Agregar email")
            .locatedBy("//*[@id='userEmail']");
    public static final Target AGE = Target.the("Agregar edad")
            .locatedBy("//*[@id='age']");
    public static final Target SALARY = Target.the("Agregar salario")
            .locatedBy("//*[@id='salary']");
    public static final Target DEPARTMENT = Target.the("Agregar departamento")
            .locatedBy("//*[@id='department']");

    public static final Target DELETE = Target.the("Eliminar Elemento")
            .locatedBy("//*[@id='delete-record-2']");

    public static final Target NAME = Target.the("Nombre")
            .locatedBy("//*[contains(text(), '{0}')]");


}
