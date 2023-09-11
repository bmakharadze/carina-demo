package com.solvd.gui.nopcommerce.common;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class RegisterPageBase extends AbstractPage implements IAbstractTest {

    public RegisterPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPageOpened();

    public abstract HomePageBase Register();

    public abstract HomePageBase clickRegisterBtn();

    public abstract void typeFirstNameInput();

    public abstract void typeLastNameInput();

    public abstract void typeEmailInput();

    public abstract void typePasswordInput();

    public abstract void typeConfirmPasswordInput();

}