package com.selenium.test.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class Methods {
    private WebDriver driver;

    public Methods(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getByXpath(String xpath){
        return driver.findElement(By.xpath(xpath));
    }
    public WebElement getByXpathText(char tag, String text){
        return driver.findElement(By.xpath("//"+tag+"[contains(text(),'"+text+"')]"));
    }


    public void nextPageConfirm(String title){
        assertTrue(driver.getTitle().contains(title));
    }

    public void chooseFromList(String text){
        WebElement catalog = driver.findElement(By.className("catalog-menu__list"));
        catalog.findElement(By.xpath("//a[contains(text(),'"+text+"')]")).click();
    }

    public WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public WebElement elementFromElement(WebElement parent, String childClassName){
        return parent.findElement(By.className(childClassName));
    }

    public boolean exists(String i) {
        return getElement(By.className(i)).isDisplayed();
    }

    public WebElement getOneFromMultiple(String ... text){
        for (String i : text){
            if (exists(i)){
                return getByXpathText('a', i);
            }

        }
        return null;
    }
}
