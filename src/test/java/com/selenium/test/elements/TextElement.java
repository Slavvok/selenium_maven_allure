package com.selenium.test.elements;

import com.selenium.test.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextElement {
    private WebDriver driver;
    private Methods methods;

    public TextElement(WebDriver driver){
        this.driver = driver;
        methods = new Methods(driver);
    }

    public String getText(String className){
        return methods.getElement(By.className(className)).getText();
    }

    public String getText(WebElement parent, String childClassName){
        return methods.elementFromElement(parent, childClassName).getText();
    }



}
