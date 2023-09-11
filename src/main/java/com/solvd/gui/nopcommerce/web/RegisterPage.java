package com.solvd.gui.nopcommerce.web;


import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.gui.nopcommerce.common.RegisterPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends RegisterPageBase {

    @FindBy(xpath = "//*[@id=\"register-button\"]")
    private ExtendedWebElement registerBtn;

    @FindBy(xpath = "//*[@id='FirstName']")
    private ExtendedWebElement firstNameInput;

    @FindBy(xpath = "//*[@id=\"LastName\"]")
    private ExtendedWebElement lastNameInput;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    private ExtendedWebElement emailInput;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"ConfirmPassword\"]")
    private ExtendedWebElement confirmPasswordInput;

    public RegisterPage(WebDriver driver) {
        super(driver);
        setPageURL("https://demo.nopcommerce.com/register?returnUrl=%2F");
    }

    @Override
    public boolean isPageOpened() {
        return firstNameInput.isElementPresent();
    }

    @Override
    public HomePage Register() {
        firstNameInput.type("Becca");
        lastNameInput.type("Mak");
        emailInput.type("becca@gmail.com");
        passwordInput.type("Becca123");
        confirmPasswordInput.type("Becca123");
        registerBtn.click();
        return new HomePage(getDriver());
    }

    @Override
    public HomePage clickRegisterBtn() {
        registerBtn.click();
        return new HomePage(getDriver());
    }

    @Override
    public void typeFirstNameInput() {
        firstNameInput.type("Becca");
    }

    @Override
    public void typeLastNameInput() {
        lastNameInput.type("Mak");
    }

    @Override
    public void typeEmailInput() {
        emailInput.type("becca@gmail.com");
    }

    @Override
    public void typePasswordInput() {
        passwordInput.type("Becca123");
    }

    @Override
    public void typeConfirmPasswordInput() {
        confirmPasswordInput.type("Becca123");
    }

}
