package com.solvd.amazon.carina.mobile.carinaapp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class RegistrationPageBase extends AbstractPage {

    public RegistrationPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract OpenedCarinaHomePageBase logIn(String login, String password, String gender);

}
