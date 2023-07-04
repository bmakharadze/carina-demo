package com.solvd.gui.saucelabs.ios;

import com.solvd.gui.saucelabs.common.HomePageBase;
import com.solvd.gui.saucelabs.common.LogInPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LogInPageBase.class)
public class LogInPage extends LogInPageBase {

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(accessibilityId = "test-Username")
    private ExtendedWebElement usernameInput;

    @ExtendedFindBy(accessibilityId = "test-Password")
    private ExtendedWebElement passwordInput;

    @ExtendedFindBy(accessibilityId = "test-LOGIN")
    private ExtendedWebElement loginBtn;

    @Override
    public boolean isPageOpened() {
        return loginBtn.isElementPresent();
    }

    @Override
    public void typeUserName(String username) {
        usernameInput.type(username);
    }

    @Override
    public void typePassword(String password) {
        passwordInput.type(password);
    }

    @Override
    public void login(String username, String password){
        usernameInput.type(username);
        passwordInput.type(password);
    }

    @Override
    public HomePageBase clickLogInBtn() {
        loginBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }

}