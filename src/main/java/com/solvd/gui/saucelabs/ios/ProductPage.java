package com.solvd.gui.saucelabs.ios;

import com.solvd.gui.saucelabs.common.ProductPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductPageBase.class)
public class ProductPage extends ProductPageBase {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(accessibilityId = "test-ADD TO CART")
    private ExtendedWebElement addToCartBtn;

    @ExtendedFindBy(accessibilityId = "test-Price")
    private ExtendedWebElement price;

    @Override
    public boolean isPageOpened() {
        return addToCartBtn.isElementPresent();
    }

    @Override
    public void clickAddToCart() {
        swipe(addToCartBtn);
        addToCartBtn.click();
    }

    @Override
    public void getPrice(){
        price.getText();
    }

}