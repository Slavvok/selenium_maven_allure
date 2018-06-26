package com.selenium.test.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemPage {

    private WebDriver driver;
    public ItemPage(WebDriver driver){
        this.driver = driver;
    }

    public String itemTitleSearch(){
        String itemTitle = driver.findElement(By.className("title")).getText();
        return itemTitle;
    }
    // Подсчет элементов в разделе Предложения магазинов
    public int countShopOffers(){
        List<WebElement> cards = driver.findElements(By.className("n-product-top-offer"));
        return cards.size();
    }
}
