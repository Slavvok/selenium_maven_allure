package com.selenium.test.elements;

import com.selenium.test.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkElement {
    private WebDriver driver;
    private Methods methods;

    public LinkElement(WebDriver driver){
        this.driver = driver;
        methods = new Methods(driver);
    }

    public void click(String text){
        methods.chooseFromList(text);
    }

    public void getByXpath(String text){
        driver.findElement(By.xpath(text)).click();

    }
    public void getByXpathText(String text){
        methods.getByXpathText('a', text).click();
    }

    public void getByXpathTextMult(String ... text){
        for (String i:text){
            if (methods.getByXpathText('a', i).isDisplayed()){
                getByXpathText(i);
                break;
            }
        }
    }


}
