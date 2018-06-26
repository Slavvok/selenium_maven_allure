package com.selenium.test.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ItemsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    public ItemsPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getAllFilters(){
        return driver.findElement(By.xpath("//a[text()='Перейти ко всем фильтрам']"));
    }

    public Integer countItems(){
        List<WebElement> cards = driver.findElements(By.className("n-snippet-card2"));
        return cards.size();
    }

    public String getItemTitle(int num){
        List<WebElement> cards = driver.findElements(By.className("n-snippet-card2"));
        // Выбор третьего элемента
        WebElement thirdElement = cards.get(num);
        // Сохранение заголовка элемента
        String elementTitle = thirdElement.findElement(By.className("n-snippet-card2__title")).getText();
        return elementTitle;
    }
}
