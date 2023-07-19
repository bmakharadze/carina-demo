package com.solvd.gui.brightcosmetics.ios;


import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.gui.brightcosmetics.common.CartPageBase;
import com.solvd.gui.brightcosmetics.common.CheckoutPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CartPageBase.class)
public class CartPage extends CartPageBase {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Checkout\"`]")
    private ExtendedWebElement checkoutBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Keep Shopping\"`]")
    private ExtendedWebElement keepShoppingBtn;

    @ExtendedFindBy(accessibilityId = "trash-2")
    private ExtendedWebElement removeFromCartBtn;

    @Override
    public boolean isPageOpened() {
        return checkoutBtn.isElementPresent();
    }

    @Override
    public CheckoutPageBase clickCheckoutBtn(){
        checkoutBtn.click();
        return initPage(getDriver(), CheckoutPageBase.class);
    }

    @Override
    public void clickKeepShoppingBtn(){
        checkoutBtn.click();
    }

    @Override
    public void clickRemoveFromCartBtn(){
        removeFromCartBtn.click();
    }

}
