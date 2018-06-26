package com.selenium.test.tests;

import com.selenium.test.MainTest;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class NewTest extends MainTest {

    @Test
    @DisplayName("Market tablets test")
    public void test(){
        init();
        driver.manage().window().maximize();
        driver.get("https://yandex.ru");
        page.getMenuItem();
        mainMenu.getMenuItem("//a[text()='Компьютеры']").click();
        categoriesPage.getCategory("/html/body/div[1]/div[4]/div[1]/div/div[1]/div/a[1]").click();
        itemsPage.getAllFilters().click();
        filtersPage.setPrices("20000", "25000");
        filtersPage.showAllBrands().click();
        filtersPage.chooseBrands("Acer", "Lenovo");
        filtersPage.showResults().click();

        int a = itemsPage.countItems();
        System.out.println(a);
        String title1 = itemsPage.getItemTitle(0);
        mainMenu.itemSearch(title1);
        String title2 = itemPage.itemTitleSearch();
        System.out.println(title1 + title2);
        assertEquals(title1, title2);
        int so = itemPage.countShopOffers();
        System.out.println(so);
    }
}
