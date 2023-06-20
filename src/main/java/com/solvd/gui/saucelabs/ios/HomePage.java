package com.solvd.gui.saucelabs.ios;

import com.solvd.gui.saucelabs.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == 'PRODUCTS'`]")
    private ExtendedWebElement productsTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"ADD TO CART\"`][2]")
    private ExtendedWebElement productAddToCartBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"REMOVE\"`][2]")
    private ExtendedWebElement productRemoveBtn;

    @Override
    public boolean isPageOpened() {
        return productsTitle.isElementPresent();
    }

    @Override
    public void clickAddToCartBtn(String product) {
        productAddToCartBtn.format(product).click();
    }

    @Override
    public void clickRemoveBtn(String product) {
        productRemoveBtn.format(product).click();
    }

    @Override
    public boolean isAddToCartBtnPresent(String product) {
        return productAddToCartBtn.format(product).isElementPresent();
    }

    @Override
    public boolean isRemoveBtnPresent(String product) {
        return productRemoveBtn.format(product).isElementPresent();
    }


}