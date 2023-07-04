package com.solvd.saucelabs;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.gui.saucelabs.common.*;
import com.solvd.gui.saucelabs.components.Filters;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SauceLabsTest implements IAbstractTest {

    private HomePageBase homePage;
    //Every test needs log in before running test.
    @BeforeClass
    public void setUp() {
        LogInPageBase loginPage = initPage(getDriver(), LogInPageBase.class);
        Assert.assertTrue(loginPage.isPageOpened(), "Login page is not opened");
        loginPage.login("standard_user", "secret_sauce");
        homePage = loginPage.clickLogInBtn();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
    }

    @Test
    public void addToCartTest() {
        String product = "Sauce Labs Backpack";
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        homePage.isAddToCartBtnPresent(product);
        homePage.clickAddToCartBtn(product);
        homePage.clickFilterBtn();
        homePage.filterBy(Filters.NAME_AZ);
    }

    //Run separately
    @Test
    public void removeFromFromCartHomePageTest() {
        String product = "Sauce Labs Backpack";
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        homePage.isAddToCartBtnPresent(product);
        homePage.clickAddToCartBtn(product);
        homePage.isRemoveBtnPresent(product);
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
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        String product = "Sauce Labs Backpack";
        homePage.clickAddToCartBtn(product);
        CartPageBase cartPage = homePage.clickCartBtn();
        cartPage.clickCheckoutBtn();
    }

}