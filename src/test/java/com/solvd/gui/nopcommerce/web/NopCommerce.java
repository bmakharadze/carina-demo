package com.solvd.gui.nopcommerce.web;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.gui.nopcommerce.common.*;
import com.solvd.gui.nopcommerce.web.*;
import com.zebrunner.agent.core.annotation.Maintainer;
import com.zebrunner.agent.core.annotation.TestRailCaseId;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NopCommerce extends AbstractTest {
    @Test
    @Maintainer("bmakharadze")
    public void LoginTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        loginPage.isPageOpened();
        HomePage homePage = loginPage.Login();
        homePage.isPageOpened();
    }

    @Test
    @Maintainer("bmakharadze")
    public void RegisterTest() {
        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.open();
        registerPage.isPageOpened();
        HomePage homePage = registerPage.Register();
    }

}