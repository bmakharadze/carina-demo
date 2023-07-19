package com.solvd.gui.brightcosmetics.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.gui.brightcosmetics.common.CartPageBase;
import com.solvd.gui.brightcosmetics.common.ProductPageBase;
import com.solvd.gui.brightcosmetics.common.ViewAllPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductPageBase.class)
public class ProductPage extends ProductPageBase {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(accessibilityId = "Item")
    private ExtendedWebElement backBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"ADD TO BAG\"`]")
    private ExtendedWebElement addToCartBtn;

    @Override
    public boolean isPageOpened() {
        return addToCartBtn.isElementPresent();
    }

    @Override
    public void clickBackBtn() {
        backBtn.click();
    }

    @Override
    public CartPageBase clickAddToCartBtn() {
        addToCartBtn.click();
        return initPage(getDriver(), CartPageBase.class);
    }

}
