package com.selenium.test.tests;

import com.selenium.test.MainTest;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class NotebookTest extends MainTest {

    @Before
    public void setUp(){
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
    }
    @Test
    @DisplayName("Market Notebooks Tests")
    public void test(){
        init();
        driver.manage().window().maximize();
        driver.get("https://yandex.ru");
        page.getMenuItem();
        mainMenu.getMenuItem("//a[text()='Компьютеры']").click();
        categoriesPage.getCategory("/html/body/div[1]/div[4]/div[1]/div/div[1]/div/a[2]").click();
        itemsPage.getAllFilters().click();

        filtersPage.setPrices("0", "30000");
        filtersPage.showAllBrands().click();
        filtersPage.chooseBrands("HP", "Lenovo");
        filtersPage.showResults().click();

        int a = itemsPage.countItems();
        System.out.println(a);
        assertThat(a, is(12));
        String title1 = itemsPage.getItemTitle(0);
        mainMenu.itemSearch(title1);
        String title2 = itemPage.itemTitleSearch();
        System.out.println(title1 + title2);
        assertEquals(title1, title2);
        int so = itemPage.countShopOffers();
        System.out.println(so);
    }
}
