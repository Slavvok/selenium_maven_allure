package com.selenium.test.Pages;

import com.selenium.test.elements.ButtonElement;
import com.selenium.test.elements.InputElement;
import com.selenium.test.elements.LinkElement;
import com.selenium.test.methods.Methods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainMenu {
    private Methods methods;
    private LinkElement linkElement;
    private InputElement inputElement;
    private ButtonElement buttonElement;

    public MainMenu(WebDriver driver){
        linkElement = new LinkElement(driver);
        methods = new Methods(driver);
        inputElement = new InputElement(driver);
        buttonElement = new ButtonElement(driver);
    }
    /*
     * Переход по ссылке меню
     */
    @Step
    public MainMenu getComputers(){
        linkElement.getByXpathTextMult("Компьютеры", "Компьютерная техника");
        String title = "Компьютерная техника — купить на Яндекс.Маркете";
        methods.nextPageConfirm(title);
        return this;
    }
    @Step
    // Главный поиск
    public MainMenu itemSearch(String str){
        inputElement.inputById("header-search", str);
        buttonElement.clickByClassName("button2");
        return this;
    }
}