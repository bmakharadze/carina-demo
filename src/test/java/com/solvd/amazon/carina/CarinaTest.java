package com.solvd.amazon.carina;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.amazon.carina.mobile.carinaapp.common.HomePageBase;
import com.solvd.amazon.carina.mobile.carinaapp.common.OpenedCarinaHomePageBase;
import com.solvd.amazon.carina.mobile.carinaapp.common.RegistrationPageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CarinaTest extends AbstractTest {

    @Test
    public void testLogIn() {
        HomePageBase carinaHomePage = initPage(getDriver(), HomePageBase.class);
        Assert.assertTrue(carinaHomePage.isPageOpened(), "Page is not opened");
        RegistrationPageBase registrationPageBase = carinaHomePage.clickNextBtn();
        OpenedCarinaHomePageBase openedCarinaHomePage = registrationPageBase.logIn("Beka", "Beka123", "Male");
        Assert.assertTrue(openedCarinaHomePage.isPageOpened(), "Could not login, page is not opened");
    }

}
