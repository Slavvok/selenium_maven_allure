package com.selenium.test.Pages;

import com.selenium.test.elements.LinkElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;


public class YandexPage {
    private LinkElement linkElement;

    public YandexPage(WebDriver driver){
        linkElement = new LinkElement(driver);
    }

    /*
     * Перейти по ссылке меню
     */

    @Step
    public YandexPage getMarket(){
        linkElement.getByXpathText("Маркет");
        return this;
    }
}
