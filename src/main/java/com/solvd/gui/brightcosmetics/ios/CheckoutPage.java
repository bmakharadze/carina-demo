package com.solvd.gui.brightcosmetics.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.gui.brightcosmetics.common.CheckoutPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CheckoutPageBase.class)
public class CheckoutPage extends CheckoutPageBase {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`value == \"Email\"`]")
    private ExtendedWebElement emailInput;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`value == \"Name\"`]")
    private ExtendedWebElement nameInput;

    @Override
    public boolean isPageOpened() {
        return emailInput.isElementPresent();
    }

    @Override
    public void typeEmail(String email){
        emailInput.type(email);
    }

    @Override
    public void typeName(String name){
        nameInput.type(name);
    }

}
