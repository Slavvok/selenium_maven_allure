package com.selenium.test.Pages;

import com.selenium.test.elements.DivElement;
import com.selenium.test.elements.LinkElement;
import com.selenium.test.elements.TextElement;
import com.selenium.test.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ItemsPage {
    private LinkElement linkElement;
    private DivElement divElement;
    private TextElement textElement;
    private Methods methods;

    public ItemsPage(WebDriver driver){
        linkElement = new LinkElement(driver);
        methods = new Methods(driver);
        divElement = new DivElement(driver);
        textElement = new TextElement(driver);
    }

    public ItemsPage getAllFilters(){
        linkElement.getByXpathText("Перейти ко всем фильтрам");
        methods.nextPageConfirm("Все фильтры");
        return this;
    }

    public Integer countItems(){
        return divElement.countDivCards("n-snippet-card2");
    }

    public String getItemTitle(int num){
        List<WebElement> cards = divElement.getDivList("n-snippet-card2");
        // Выбор третьего элемента
        WebElement item = cards.get(num);
        // Сохранение заголовка элемента
        String elementTitle = textElement.getText(item, "n-snippet-card2__title");
        return elementTitle;
    }
}
