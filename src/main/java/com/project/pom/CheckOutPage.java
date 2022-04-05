package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckOutPage extends Base{
    By bCheck = By.name("checkout");

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    public void check (){
        click(bCheck);
    }
}
