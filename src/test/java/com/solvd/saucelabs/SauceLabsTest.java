package com.solvd.saucelabs;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.gui.saucelabs.common.HomePageBase;
import com.solvd.gui.saucelabs.common.LogInPageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceLabsTest implements IAbstractTest {

    @Test
    public void loginTest() {
        LogInPageBase swagLabsLogInScreen = initPage(getDriver(), LogInPageBase.class);
        Assert.assertTrue(swagLabsLogInScreen.isPageOpened(), "Login page is not opened");
        swagLabsLogInScreen.typeUserName("standard_user");
        swagLabsLogInScreen.typePassword("secret_sauce");
        HomePageBase productsScreen = swagLabsLogInScreen.clickLogInBtn();
        Assert.assertTrue(productsScreen.isPageOpened(), "Home page is not opened");
        productsScreen.clickAddToCartBtn("Sauce Labs Backpack");
    }

}
