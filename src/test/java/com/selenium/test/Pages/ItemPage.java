package com.selenium.test.Pages;

import com.selenium.test.elements.DivElement;
import com.selenium.test.elements.TextElement;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ItemPage {
    DivElement divElement;
    TextElement textElement;


    public ItemPage(WebDriver driver) {
        divElement = new DivElement(driver);
        textElement = new TextElement(driver);
    }
    //Поиск заголовка товара
    @Step
    public String itemTitleSearch(){
         String itemTitle = textElement.getText("title");
         return itemTitle;
    }
    // Подсчет элементов в разделе Предложения магазинов
    @Step
    public int countShopOffers(){
        int count = divElement.countDivCards("n-product-top-offer");
        return count;
    }
}
