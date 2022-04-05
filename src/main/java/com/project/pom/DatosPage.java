package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatosPage extends Base{
    By fName = By.id("first-name");
    By lName = By.id("last-name");
    By zipcode = By.id("postal-code");
    By botonCont = By.id("continue");

    public DatosPage(WebDriver driver) {
        super(driver);
    }
    public void completarDatos (){
        tipear(fName,"Roberto");
        tipear(lName,"Paredes");
        tipear(zipcode,"33500");
        click((botonCont));
    }
}
