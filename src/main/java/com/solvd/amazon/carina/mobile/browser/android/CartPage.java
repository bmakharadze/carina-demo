package com.solvd.amazon.carina.mobile.browser.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.browser.common.CartPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartPage extends CartPageBase {

    @FindBy(xpath = "//android.widget.Button[@text='Delete']")
    private ExtendedWebElement deleteBtn;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Cart\"]")
    private ExtendedWebElement cartLgoBtn;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return cartLgoBtn.isElementPresent();
    }

    @Override
    public void clickDeleteProduct() {
        deleteBtn.click();
    }


}