package com.selenium.test.tests;

import com.selenium.test.MainTest;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class NotebooksTest extends MainTest {

    public WebDriver setUpDriver(){
        ChromeDriverManager.getInstance().setup();
        return driver = new ChromeDriver();
    }

    @Test
    @DisplayName("Market Notebooks Test")
    public void test(){
        yandexPage.getMarket();
        mainMenu.getComputers();
        categoriesPage.getNotebooks();
        itemsPage.getAllFilters();

        filtersPage.setPrices("0", "30000")
                .showAllBrands()
                .chooseBrands(driver,"HP", "Lenovo")
                .getResults();

        int a = itemsPage.countItems();
        System.out.println(a);
        String title1 = itemsPage.getItemTitle(0);
        mainMenu.itemSearch(title1);
        String title2 = itemPage.itemTitleSearch();
        System.out.println(title2);
        assertTrue(title2.contains(title1));
        int so = itemPage.countShopOffers();
        System.out.println(so);
    }
}
