package com.selenium.test;

import com.selenium.test.Pages.*;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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

