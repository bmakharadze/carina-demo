package com.solvd.amazon.carina;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.amazon.carina.mobile.browser.ios.*;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IosMobileTest implements IAbstractTest, IMobileUtils {
    @Test(description = "Went to Today's deals page and added specific item to cart. ")
    public void amazonMobileBooksTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home Page is not opened");
        DealsPage iosMenuPage = homePage.openDealsPage();
        Assert.assertTrue(iosMenuPage.isPageOpened(), "Deals Page is not opened");
        ProductsPage productsPage = iosMenuPage.openDepartmentPage();
        Assert.assertTrue(productsPage.isPageOpened(), "Products Page is not opened");
        //CartPage cartPage = productsPage.cartPage();
    }

    @Test(description = "Deleted item from cart. Requires product to be in cart.")
    public void amazonMobileDeleteProductTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home Page is not opened");
        CartPage cartPage = homePage.openCartPage();
        cartPage.clickDeleteProduct();
        Assert.assertTrue(cartPage.isPageOpened(), "Cart Page is not opened");
    }

    @Test(description = "Searched Laptop and added specific one to cart.")
    public void amazonMobileLaptopTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home Page is not opened");
        SearchedProductPage searchedProductPage = homePage.openSearchedProductPage();
        Assert.assertTrue(searchedProductPage.isPageOpened(), "Searched Product Page is not opened");
        ProductsPage productsPage = searchedProductPage.openProductsPage();
        Assert.assertTrue(productsPage.isPageOpened(), "Products Page is not opened");
    }

}
