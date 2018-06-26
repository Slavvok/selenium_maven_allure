package com.selenium.test;

import com.selenium.test.Pages.*;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class MainTest {
    protected WebDriver driver;
    protected Page page;
    protected MainMenu mainMenu;
    protected CategoriesPage categoriesPage;
    protected ItemPage itemPage;
    protected ItemsPage itemsPage;
    protected FiltersPage filtersPage;

    @Before
    public void setUp(){
        FirefoxDriverManager.getInstance().setup();
        driver = new FirefoxDriver();
    }
    @After
    public void tearDown(){
        driver.quit();
    }

    public void init(){
        page = new Page(driver);
        mainMenu = new MainMenu(driver);
        categoriesPage = new CategoriesPage(driver);
        itemPage = new ItemPage(driver);
        itemsPage = new ItemsPage(driver);
        filtersPage = new FiltersPage(driver);
    }
}

