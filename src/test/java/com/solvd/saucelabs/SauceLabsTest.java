package com.solvd.saucelabs;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.gui.saucelabs.common.*;
import com.solvd.gui.saucelabs.components.Filters;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceLabsTest implements IAbstractTest {

    //Filtering the products may cause errors.

    private HomePageBase homePage;
    @Description("Set up, Every test needs log in before running test.")
    @BeforeMethod
    public void setUp() {
        LogInPageBase loginPage = initPage(getDriver(), LogInPageBase.class);
        Assert.assertTrue(loginPage.isPageOpened(), "Login page is not opened");
        loginPage.login("standard_user", "secret_sauce");
        homePage = loginPage.clickLogInBtn();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
    }

    @Description("")
    @Test
    public void addToCartTest() {
        String product = "Sauce Labs Backpack";
        homePage.clickAddToCartBtn(product);
    }

    @Test
    public void filterProductsTest(){
        homePage.clickFilterBtn();
        homePage.filterBy(Filters.PRICE_LOW);
        homePage.pause(5);
    }

    @Test
    public void removeFromCartHomePageTest() {
        String product = "Sauce Labs Backpack";
        homePage.clickAddToCartBtn(product);
        homePage.clickRemoveBtn(product);
    }

    @Test
    public void webViewScreenTest() {
        NavigationPageBase navigationPage = homePage.clickNavigationBtn();
        Assert.assertTrue(navigationPage.isPageOpened(), "Navigation page is not opened");
        WebViewPageBase webViewPageBase = navigationPage.clickWebViewBtn();
        Assert.assertTrue(webViewPageBase.isPageOpened(), "Web View page is not opened");
        webViewPageBase.urlInput("www.google.com");
        webViewPageBase.clickGoToSiteBtn();
    }

    @Test
    public void checkoutTest(){
        String product = "Sauce Labs Backpack";
        homePage.clickAddToCartBtn(product);
        CartPageBase cartPage = homePage.clickCartBtn();
        Assert.assertTrue(cartPage.isPageOpened(), "Cart page is not opened");
        CheckoutPageBase checkoutPage = cartPage.clickCheckoutBtn();
        Assert.assertTrue(checkoutPage.isPageOpened(), "Checkout page is not opened");
        checkoutPage.fillCheckoutInputs("becca", "m", "6000");
        checkoutPage.clickContinueBtn();
        checkoutPage.clickFinishBtn();
    }

    @Test
    public void addProductToCartFromProductPageTest(){
        String product = "Sauce Labs Backpack";
        ProductPageBase productPage = homePage.clickProduct(product);
        Assert.assertTrue(productPage.isPageOpened(), "Product page is not opened");
        productPage.clickAddToCart();
    }


    @Test
    public void allowGeoLocationAndGetCoordinatesTest(){
        NavigationPageBase navigationPage = homePage.clickNavigationBtn();
        Assert.assertTrue(navigationPage.isPageOpened(), "Navigation page is not opened");
        GeoLocationPageBase geoLocationPage = navigationPage.clickGeoLocationBtn();
        Assert.assertTrue(geoLocationPage.isPageOpened(), "Geo Location page is not opened");
        geoLocationPage.clickAllowOnceBtn();
        geoLocationPage.getGeoLocation();
        geoLocationPage.pause(5);
    }
}