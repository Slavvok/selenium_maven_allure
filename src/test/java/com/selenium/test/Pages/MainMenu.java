package com.selenium.test.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainMenu {
    private WebDriver driver;

    public MainMenu(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getMenuItem(String str){
        return driver.findElement(By.xpath(str));
    }

    public void itemSearch(String str){
        driver.findElement(By.id("header-search")).sendKeys(str);
        driver.findElement(By.className("button2")).click();
    }
}