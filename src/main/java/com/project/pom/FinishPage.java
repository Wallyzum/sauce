package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FinishPage extends Base{
    By botonfinish = By.id("finish");

    public FinishPage(WebDriver driver) {
        super(driver);
    }
    public void finalizar(){
        this.ScreenShot();
        click(botonfinish);
    }
}
