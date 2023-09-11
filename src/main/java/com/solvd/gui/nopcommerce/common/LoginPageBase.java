package com.solvd.gui.nopcommerce.common;


import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.gui.AbstractPage;

import com.solvd.gui.nopcommerce.common.HomePageBase;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage implements IAbstractTest {

    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPageOpened();

    public abstract void clickLoginBtn();

    public abstract void typeLoginInput();

    public abstract void typePasswordInput();

    public abstract HomePageBase Login();
}