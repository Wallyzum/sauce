package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;


public class ItemPage extends Base{

    By addtocart = By.className("btn_primary");
    By cart = By.id("shopping_cart_container");
    By itemlist = By.className("inventory_item");
    List<WebElement> itemList;
    public ItemPage(WebDriver driver) {
        super(driver);
    }
    public void comprar (){
        itemList = cargarlista(itemlist);
        for (int i =0; i < itemList.size();i++) {
        itemList.get(i).findElement(addtocart).click();
        }
        click(cart);

    }
}
