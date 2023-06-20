package com.solvd.proxyman;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//*[@placeholder='Username']")
    private ExtendedWebElement fillUsername;

    @FindBy(xpath = "//*[@placeholder='Password']")
    private ExtendedWebElement fillPassword;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageURL("https://www.solvd.com/");
    }
}
