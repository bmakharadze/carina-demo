package com.solvd.gui.nopcommerce.web;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.gui.nopcommerce.common.*;
import com.solvd.gui.nopcommerce.web.*;
import com.zebrunner.agent.core.annotation.Maintainer;
import com.zebrunner.agent.core.annotation.TestCaseKey;
import org.testng.annotations.Test;
import com.zebrunner.agent.core.registrar.TestCase;
import org.testng.annotations.BeforeSuite;
import static org.testng.Assert.*;

public class NopCommerce extends AbstractTest {
    @BeforeSuite
    public void setup() {
        TestCase.enableRealTimeSync();
    }

    @Test
    @Maintainer("bmakharadze")
    @TestCaseKey("DEF-1085")
    public void LoginTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        loginPage.isPageOpened();
        HomePage homePage = loginPage.Login();
        homePage.isPageOpened();
    }

    @Test
    @Maintainer("bmakharadze")
    @TestCaseKey("DEF-1082")
    public void RegisterTest() {
        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.open();
        registerPage.isPageOpened();
        HomePage homePage = registerPage.Register();
    }

//    @Test
//    @Maintainer("bmakharadze")
//    @TestCaseKey("DEF-1082")
//    public void AddProductToTheCart() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.open();
//        DesktopsPage desktopsPage = homePage.clickDesktopsBtn();
//        ProductPage productPage = desktopsPage.clickProduct();
//        productPage.clickAddToCartBtn();
//    }

}