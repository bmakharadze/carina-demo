package com.solvd.gui.saucelabs.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.gui.saucelabs.common.CartPageBase;
import com.solvd.gui.saucelabs.common.CheckoutPageBase;
import com.solvd.gui.saucelabs.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CartPageBase.class)
public class CartPage extends CartPageBase {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"REMOVE\"`][2]")
    private ExtendedWebElement removeFromCartBtn;

    @ExtendedFindBy(accessibilityId = "test-CONTINUE SHOPPING")
    private ExtendedWebElement continueShoppingBtn;

    @ExtendedFindBy(accessibilityId = "test-CHECKOUT")
    private ExtendedWebElement checkoutBtn;

    @Override
    public boolean isPageOpened() {
        return continueShoppingBtn.isElementPresent();
    }

    @Override
    public void clickRemoveFromCartBtn() {
        removeFromCartBtn.click();
    }

    @Override
    public void clickContinueShoppingBtn() {
        continueShoppingBtn.click();
    }

    @Override
    public CheckoutPageBase clickCheckoutBtn() {
        checkoutBtn.click();
        return initPage(getDriver(), CheckoutPageBase.class);
    }
}
