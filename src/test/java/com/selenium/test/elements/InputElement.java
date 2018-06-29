package com.selenium.test.elements;

import com.selenium.test.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputElement {
    private Methods methods;

    public InputElement(WebDriver driver){
        methods = new Methods(driver);
    }

    public void inputById(String id, String key){
        methods.getElement(By.id(id)).sendKeys(key);
    }


}
