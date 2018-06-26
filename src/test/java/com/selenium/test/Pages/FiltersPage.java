package com.selenium.test.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FiltersPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public FiltersPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 20);
    }
    // Задать диапазон цен
    public void setPrices(String priceFrom, String priceTo){
        driver.findElement(By.id("glf-pricefrom-var")).sendKeys(priceFrom);
        driver.findElement(By.id("glf-priceto-var")).sendKeys(priceTo);
    }
    // Выбрать определенные бренды
    public void chooseBrands(String ... brandsList){
        WebElement firstBrand = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='n-filter-block__list-items-wrap']")));
        firstBrand.click();

        for (String i: brandsList) {
            String firstSymbol = Character.toString(i.charAt(0));
            WebElement catBrand = driver.findElement(By.xpath("//div[text()='" + firstSymbol + "']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", catBrand);
            WebElement el;
            el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='" + i + "']")));
            el.click();
        }
    }
    // Показать всё
    public WebElement showAllBrands(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[4]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/button")));
    }
    // Показать все элементы
    public WebElement showResults(){
        return driver.findElement(By.cssSelector("a.button:nth-child(2)"));
    }
}
