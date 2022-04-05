package com.project.pom;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class LogTest  {
    private WebDriver driver;
    LogPage logPage;



    @BeforeMethod
    public void setUp(){
        logPage = new LogPage(driver);
        driver = logPage.OpenChrome();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");


    }
    @AfterMethod
    public void cerrar (){
       // driver.close();

    }
    @Test
    public void test (){
        logPage.loguear();
        ItemPage itemPage = new ItemPage(driver);
        itemPage.comprar();
        esperar();
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        checkOutPage.check();
        esperar();
        DatosPage datosPage = new DatosPage(driver);
        datosPage.completarDatos();
        esperar();
        FinishPage finishPage = new FinishPage(driver);
        finishPage.finalizar();
        esperar();


    }
    public void esperar (){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("shopping_cart_container")));
        assertTrue(driver.findElement(By.id("shopping_cart_container")).isEnabled());

    }
}
