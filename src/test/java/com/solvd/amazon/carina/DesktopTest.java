package com.solvd.amazon.carina;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.amazon.carina.mobile.browser.desktop.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopTest implements IAbstractTest {

    @Test(description = "Went to Today's deals page and added specific item to cart. ")
    public void amazonDesktopBooksTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.openURL("https://amazon.com/");
        Assert.assertTrue(homePage.isPageOpened(), "Home Page is not opened");
        DealsPage dealsPage = homePage.openDealsPage();
        Assert.assertTrue(dealsPage.isPageOpened(), "Deals Page is not opened");
        ProductsPage productsPage = dealsPage.openDepartmentPage();
        Assert.assertTrue(productsPage.isPageOpened(), "Product Page is not opened");
        CartPage cartPage = productsPage.openCartPage();
        //cartPage.clickDeleteProduct();
        Assert.assertTrue(cartPage.isPageOpened(), "Cart  Page is not opened");
    }

    @Test(description = "Searched Laptop and added specific one to cart.")
    public void amazonDesktopLaptopTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.openURL("https://amazon.com/");
        Assert.assertTrue(homePage.isPageOpened(), "Home Page is not opened");
        SearchedProductPage searchedProductPage = homePage.openSearchedProductPage();
        Assert.assertTrue(searchedProductPage.isPageOpened(), "Searched Product Page is not opened");
        ProductsPage productsPage = searchedProductPage.openProductsPage();
        CartPage cartPage = productsPage.openCartPage();
        Assert.assertTrue(cartPage.isPageOpened(), "Cart  Page is not opened");
    }
}
