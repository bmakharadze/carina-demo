package com.solvd.amazon.carina.mobile.carinaapp.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.carinaapp.common.OpenedCarinaHomePageBase;
import com.solvd.amazon.carina.mobile.carinaapp.common.RegistrationPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = RegistrationPageBase.class)
public class RegistrationPage extends RegistrationPageBase {

    @FindBy(id = "name")
    private ExtendedWebElement nameTextBox;

    @FindBy(id = "password")
    private ExtendedWebElement passwordTextBox;

    @FindBy(id = "radio_male")
    private ExtendedWebElement radioMale;

    @FindBy(id = "radio_female")
    private ExtendedWebElement radioFemale;

    @FindBy(id = "checkbox")
    private ExtendedWebElement agreeCheckBox;

    @FindBy(id = "login_button")
    private ExtendedWebElement signInButton;


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public OpenedCarinaHomePageBase logIn(String login, String password, String gender) {
        nameTextBox.type(login);
        passwordTextBox.type(password);
        switch (gender) {
            case "Male":
                radioMale.click();
                break;
            case "Female":
                radioFemale.click();
                break;
            default:
                throw new RuntimeException("Gender is not Correct");
        }
        agreeCheckBox.click();
        signInButton.click();
        return initPage(getDriver(), OpenedCarinaHomePageBase.class);
    }

}
