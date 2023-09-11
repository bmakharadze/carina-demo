package com.solvd.gui.nopcommerce.web;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.gui.nopcommerce.common.LoginPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends LoginPageBase {

    @FindBy(xpath = "//*[@id=\"Email\"]")
    private ExtendedWebElement email_input;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    private ExtendedWebElement password_input;

    @FindBy(xpath = "//*[contains(text(), 'Log in')][1]fail")
    private ExtendedWebElement login_btn;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageURL("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @Override
    public boolean isPageOpened() {
        return email_input.isElementPresent();
    }

    @Override
    public void clickLoginBtn() {
        login_btn.click();
    }

    @Override
    public void typeLoginInput() {
        email_input.type("becca@gmail.com");
    }

    @Override
    public void typePasswordInput() {
        password_input.type("Becca123");
    }

    @Override
    public HomePage Login() {
        email_input.type("becca@gmail.com");
        password_input.type("213");
        login_btn.click();
        return new HomePage(getDriver());
    }

}
