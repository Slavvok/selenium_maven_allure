package com.selenium.test.elements;

import com.selenium.test.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonElement {
    private WebDriver driver;
    private Methods methods;

    public ButtonElement(WebDriver driver){
        this.driver = driver;
        methods = new Methods(driver);
    }

    public ButtonElement clickByXpath(String xpath){
        methods.getByXpath(xpath).click();
        return this;
    }

    public ButtonElement clickByCssSelector(String cssSelector){
        methods.getElement(By.cssSelector(cssSelector)).click();
        return this;
    }

    public void clickByClassName(String className){
        methods.getElement(By.className(className)).click();
    }
}

