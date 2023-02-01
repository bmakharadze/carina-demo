package com.solvd.amazon.first;

import com.solvd.amazon.page.first.AmazonHomePage;
import com.solvd.amazon.page.first.TodayDealsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AmazonTest {

    WebDriver driver;
    @Test(priority = 1)
    public void AddToCart() {
        TodayDealsPage todayDealsPage = new TodayDealsPage(driver);
        todayDealsPage.open();
        todayDealsPage.clickChangeLanguage();
        todayDealsPage.clickTodayDeals();
        todayDealsPage.clickBooksButton();
        //Some products do not have ADD TO CART button.
        todayDealsPage.clickBook();
        todayDealsPage.clickAddToCartButton();

        //deleting product from cart.
        todayDealsPage.clickCartButton();
        todayDealsPage.clickDeleteItemButton();
        todayDealsPage.pause(10);
    }
    @Test(priority = 2)
    public void SearchLaptops() {
        AmazonHomePage homePage = new AmazonHomePage(driver);
        homePage.open();
        homePage.searchBarType("laptop");
        homePage.clickSearch();
        homePage.clickPrice();
        homePage.getSearchResult();
        //getting product names in logs
        homePage.printResultItemTexts();
        homePage.pause(10);
    }
}