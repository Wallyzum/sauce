package com.project.pom;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.testng.Assert.assertTrue;


public class Base{

    private WebDriver driver;
    public Base(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebDriver OpenChrome () {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Wally/IdeaProjects/jugando/Comprando/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public WebElement buscar (By locator){
        return driver.findElement(locator);
    }

    public void tipear (By locator,String text){
        driver.findElement(locator).sendKeys(text);
    }
    public void click (By locator){
        driver.findElement(locator).click();
    }
    public boolean existe (By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public void asser(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        //assertTrue(driver.findElement(By.id(locator)).isEnabled(),);
    }
    public void ScreenShot () {
        File todo = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(todo, new File("Terminado"+System.currentTimeMillis()+".png"));
        }   catch (IOException e){
            e.printStackTrace();
        }
    }
    public List<WebElement> cargarlista (By locator){
        List<WebElement> Itemlist = driver.findElements(locator);
        return Itemlist;
    }

}
