package com.solvd.saucelabs;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.gui.saucelabs.common.*;
import com.solvd.gui.saucelabs.components.Filters;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceLabsTest implements IAbstractTest {

    //Filtering the products may cause errors.

    private HomePageBase homePage;

    @BeforeMethod(description = "Set up, Every test needs log in before running test.")
    public void setUp() {
        LogInPageBase loginPage = initPage(getDriver(), LogInPageBase.class);
        Assert.assertTrue(loginPage.isPageOpened(), "Login page is not opened");
        loginPage.login("standard_user", "secret_sauce");
        homePage = loginPage.clickLogInBtn();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
    }

    @Test(description = "Adding product to the cart.")
    public void addToCartTest() {
        String product = "Sauce Labs Backpack";
        homePage.clickAddToCartBtn(product);
    }

    @Test(description = "")
    public void dragAndDropProductToTheCartTest() {
        homePage.dragAndDrop();
    }

    @Test(description = "")
    public void filterProductsTest(){
        homePage.clickFilterBtn();
        homePage.filterBy(Filters.PRICE_LOW);
        homePage.pause(5);
    }

    @Test(description = "")
    public void removeFromCartHomePageTest() {
        String product = "Sauce Labs Backpack";
        homePage.clickAddToCartBtn(product);
        homePage.clickRemoveBtn(product);
    }

    @Test(description = "")
    public void webViewScreenTest() {
        NavigationPageBase navigationPage = homePage.clickNavigationBtn();
        Assert.assertTrue(navigationPage.isPageOpened(), "Navigation page is not opened");
        WebViewPageBase webViewPage = navigationPage.clickWebViewBtn();
        Assert.assertTrue(webViewPage.isPageOpened(), "Web View page is not opened");
        webViewPage.urlInput("www.amazon.com");
        webViewPage.clickGoToSiteBtn();
        webViewPage.pause(4);
    }

    @Test(description = "")
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

    @Test(description = "")
    public void addProductToCartFromProductPageTest(){
        String product = "Sauce Labs Backpack";
        ProductPageBase productPage = homePage.clickProduct(product);
        Assert.assertTrue(productPage.isPageOpened(), "Product page is not opened");
        productPage.clickAddToCart();
    }


    @Test(description = "")
    public void allowGeoLocationAndGetCoordinatesTest(){
        NavigationPageBase navigationPage = homePage.clickNavigationBtn();
        Assert.assertTrue(navigationPage.isPageOpened(), "Navigation page is not opened");
        GeoLocationPageBase geoLocationPage = navigationPage.clickGeoLocationBtn();
        Assert.assertTrue(geoLocationPage.isPageOpened(), "Geo Location page is not opened");
        geoLocationPage.clickAllowOnceBtn();
        geoLocationPage.getGeoLocation();
        geoLocationPage.pause(5);
    }

    @Test(description = "")
    public void drawingTest(){
        NavigationPageBase navigationPage = homePage.clickNavigationBtn();
        Assert.assertTrue(navigationPage.isPageOpened(), "Navigation page is not opened");
        DrawingPageBase drawingPage = navigationPage.clickDrawingBtn();
        Assert.assertTrue(drawingPage.isPageOpened(), "Navigation page is not opened");
        drawingPage.draw(IMobileUtils.Direction.DOWN, 3000);
        drawingPage.clickSaveBtn();
    }

    @Test(description = "Testing amazon from Web View page, Searching product and adding to cart.")
    public void wViewAmazonTest(){
        NavigationPageBase navigationPage = homePage.clickNavigationBtn();
        Assert.assertTrue(navigationPage.isPageOpened(), "Navigation page is not opened");
        WebViewPageBase webViewPage = navigationPage.clickWebViewBtn();
        Assert.assertTrue(webViewPage.isPageOpened(), "Web View page is not opened");
        webViewPage.urlInput("www.amazon.com");
        WebViewAmazonBase webViewAmazon = webViewPage.clickGoToSiteBtn();
        webViewAmazon.typeSearch("laptop");
        webViewAmazon.clickSearchBtn();
    }

}