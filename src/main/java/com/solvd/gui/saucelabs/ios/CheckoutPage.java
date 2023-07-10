package com.solvd.gui.saucelabs.ios;


import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.gui.saucelabs.common.CheckoutPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CheckoutPageBase.class)
public class CheckoutPage extends CheckoutPageBase {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "label == \"CHECKOUT: INFORMATION\" AND name == \"CHECKOUT: INFORMATION\" AND value == \"CHECKOUT: INFORMATION\"")
    private ExtendedWebElement randomPlace;

    @ExtendedFindBy(accessibilityId = "test-First Name")
    private ExtendedWebElement firstNameInput;

    @ExtendedFindBy(accessibilityId = "test-Last Name")
    private ExtendedWebElement lastNameInput;

    @ExtendedFindBy(accessibilityId = "test-Zip/Postal Code")
    private ExtendedWebElement zipCodeInput;

    @ExtendedFindBy(accessibilityId = "test-CANCEL")
    private ExtendedWebElement cancelBtn;

    @ExtendedFindBy(accessibilityId = "test-CONTINUE")
    private ExtendedWebElement continueBtn;

    @ExtendedFindBy(accessibilityId = "test-FINISH")
    private ExtendedWebElement finishBtn;

    @Override
    public boolean isPageOpened() {
        return firstNameInput.isElementPresent();
    }

    @Override
    public void clickContinueBtn() {
        continueBtn.click();
    }

    @Override
    public void fillCheckoutInputs(String firstName, String lastName, String zipCode) {
        firstNameInput.type(firstName);
        lastNameInput.type(lastName);
        zipCodeInput.type(zipCode);
        zipCodeInput.sendKeys(Keys.RETURN);
    }

    @Override
    public void clickFinishBtn(){
        swipe(finishBtn);
        finishBtn.click();
    }

}