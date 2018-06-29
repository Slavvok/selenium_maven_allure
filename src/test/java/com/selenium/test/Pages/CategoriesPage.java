package com.selenium.test.Pages;

import com.selenium.test.elements.LinkElement;
import com.selenium.test.methods.Methods;
import org.openqa.selenium.WebDriver;

public class CategoriesPage {
    private Methods methods;
    private LinkElement linkElement;

    public CategoriesPage(WebDriver driver){
        linkElement = new LinkElement(driver);
        methods = new Methods(driver);
    }

    public CategoriesPage getNotebooks(){
        linkElement.getByXpath("/html/body/div[1]/div[4]/div[1]/div/div[1]/div/a[2]");
        methods.nextPageConfirm("Ноутбуки — купить на Яндекс.Маркете");
        return this;
    }
    public CategoriesPage getTablets(){
        linkElement.getByXpath("/html/body/div[1]/div[4]/div[1]/div/div[1]/div/a[1]");
        methods.nextPageConfirm("Планшеты — купить на Яндекс.Маркете");
        return this;
    }
}
