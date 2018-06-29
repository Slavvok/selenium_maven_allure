package com.selenium.test.tests;

import com.selenium.test.MainTest;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TabletsTest extends MainTest {
    @Test
    @DisplayName("Market tablets test")
    public void test(){
        yandexPage.getMarket();
        mainMenu.getComputers();
        categoriesPage.getTablets();
        itemsPage.getAllFilters();

        filtersPage.setPrices("20000", "25000")
                .showAllBrands()
                .chooseBrands(driver,"Acer", "Lenovo")
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
