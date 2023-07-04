package com.solvd.gui.saucelabs.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.gui.saucelabs.common.CartPageBase;
import com.solvd.gui.saucelabs.common.WebViewPageBase;
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
    public void clickRemoveFromCartBtn() {
        removeFromCartBtn.click();
    }

    @Override
    public void clickContinueShoppingBtn() {
        continueShoppingBtn.click();
    }

    @Override
    public void clickCheckoutBtn() {
        checkoutBtn.click();
    }
}
