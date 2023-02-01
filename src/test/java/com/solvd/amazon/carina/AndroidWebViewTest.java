package com.solvd.amazon.carina;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.amazon.carina.mobile.browser.MobileContextUtils;
import com.solvd.amazon.carina.mobile.browser.View;
import com.solvd.amazon.carina.mobile.browser.webview.*;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AndroidWebViewTest implements IAbstractTest, IMobileUtils {

    @Test(description = "Went to Today's deals page and added specific item to cart. ")
    public void amazonMobileBooksTestAndroidWebView() {
        HomePage homePage = new HomePage(getDriver());
        homePage.openURL("https://amazon.com/");
        Assert.assertTrue(homePage.isPageOpened(), "Home Page was not opened");
        MobileContextUtils contextHelper = new MobileContextUtils();
        contextHelper.switchMobileContext(View.WEB);
        DealsPage dealsPage = homePage.openDealsPage();
        Assert.assertTrue(dealsPage.isPageOpened(), "Deals Page was not opened");
        ProductsPage productsPage = dealsPage.openDepartmentPage();
        CartPage cartPage = productsPage.openCartPage();
        cartPage.clickDeleteProduct();
        Assert.assertTrue(cartPage.isPageOpened(), "Cart Page was not opened");
    }

    @Test(description = "Searched Laptop and added specific one to cart.")
    public void amazonMobileLaptopTestAndroidWebView() {
        HomePage homePage = new HomePage(getDriver());
        homePage.openURL("https://amazon.com/");
        Assert.assertTrue(homePage.isPageOpened(), "Home Page was not opened");
        MobileContextUtils contextHelper = new MobileContextUtils();
        contextHelper.switchMobileContext(View.WEB);
        SearchedProductPage searchedProductPage = homePage.openSearchedProductPage();
        Assert.assertTrue(searchedProductPage.isPageOpened(), "Searched Product Page was not opened");
        ProductsPage productsPage = searchedProductPage.openProductsPage();
        CartPage cartPage = productsPage.openCartPage();
        Assert.assertTrue(cartPage.isPageOpened(), "Cart Page was not opened");
    }

}
