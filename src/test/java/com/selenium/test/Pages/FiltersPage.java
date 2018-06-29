package com.selenium.test.Pages;

import com.selenium.test.elements.ButtonElement;
import com.selenium.test.elements.InputElement;
import com.selenium.test.methods.Methods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FiltersPage {
    private ButtonElement buttonElement;
    private InputElement inputElement;
    private Methods methods;

    public FiltersPage(WebDriver driver){
        buttonElement = new ButtonElement(driver);
        inputElement = new InputElement(driver);
        methods = new Methods(driver);
    }
    // Задать диапазон цен
    @Step
    public FiltersPage setPrices(String priceFrom, String priceTo){
        inputElement.inputById("glf-pricefrom-var", priceFrom);
        inputElement.inputById("glf-priceto-var", priceTo);
        return this;
    }
    // Выбрать определенные бренды
    @Step
    public void chooseBrands(WebDriver driver, String ... brandsList){
        try {
            Thread.sleep(1000);
        } catch (Exception e){

        }
        WebElement brands = driver.findElement(By.className("n-filter-block__list-items-wrap"));

        for (String i: brandsList) {
            String firstSymbol = Character.toString(i.charAt(0));
            WebElement catBrand = brands.findElement(By.xpath("//div[text()='" + firstSymbol + "']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", catBrand);
            WebElement el;
            el = brands.findElement(By.xpath("//label[text()='" + i + "']"));
            el.click();
        }
    }
    // Показать всё
    @Step
    public FiltersPage showAllBrands(){
        buttonElement.clickByXpath("/html/body/div[1]/div[4]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/button");
        return this;
    }
    // Показать все элементы
    @Step
    public FiltersPage getResults(){
        buttonElement.clickByCssSelector("a.button:nth-child(2)");
        methods.nextPageConfirm("купить на Яндекс.Маркете");
        return this;
    }
}
