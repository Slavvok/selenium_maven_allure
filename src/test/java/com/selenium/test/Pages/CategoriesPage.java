package com.selenium.test.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoriesPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public CategoriesPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 20);
    }

    public WebElement getCategory(String str){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(str)));
    }
}
