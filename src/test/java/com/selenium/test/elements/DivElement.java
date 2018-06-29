package com.selenium.test.elements;

import com.selenium.test.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class DivElement {
    private WebDriver driver;
    private Methods methods;

    public DivElement(WebDriver driver){
        this.driver = driver;
        methods = new Methods(driver);
    }

    public List<WebElement> getDivList(String className){
        List<WebElement> cards = driver.findElements(By.className(className));
        return cards;
    }

    public int countDivCards(String className){
        return getDivList(className).size();
    }

    public void count(){

    }
}


