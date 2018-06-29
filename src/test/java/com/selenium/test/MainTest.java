package com.selenium.test;

import com.selenium.test.Pages.*;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class MainTest {
    protected WebDriver driver;
    public YandexPage yandexPage;
    public MainMenu mainMenu;
    public CategoriesPage categoriesPage;
    public ItemPage itemPage;
    public ItemsPage itemsPage;
    public FiltersPage filtersPage;

    @Before
    public void setUp(){
        driver = setUpDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://yandex.ru");
        init();
    }

    public WebDriver setUpDriver(){
        FirefoxDriverManager.getInstance().setup();
        return driver = new FirefoxDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }


    public void init(){
        yandexPage = new YandexPage(driver);
        mainMenu = new MainMenu(driver);
        categoriesPage = new CategoriesPage(driver);
        itemPage = new ItemPage(driver);
        itemsPage = new ItemsPage(driver);
        filtersPage = new FiltersPage(driver);
    }
}

