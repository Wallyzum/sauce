package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogPage extends Base {

    String user = "standard_user";
    String pass = "secret_sauce";
    By usuario = By.id("user-name");
    By password = By.id("password");
    By boton = By.id("login-button");

    public LogPage(WebDriver driver) {
        super(driver);
    }
    public void loguear () {
        tipear(usuario, user);
        tipear(password, pass);
        click(boton);
    }

}
