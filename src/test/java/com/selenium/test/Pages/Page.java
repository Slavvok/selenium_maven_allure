package com.selenium.test.Pages;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Page {
    private WebDriver driver;
    private WebDriverWait wait;

    public Page(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 20);
    }

    public void getMenuItem(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-id='market']"))).click();
    }
    //text
}
