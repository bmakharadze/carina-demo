package com.solvd.amazon.carina.mobile.browser.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.browser.common.CartPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartPage extends CartPageBase {

    @FindBy(xpath = "//android.view.View[@content-desc=\"Cart\"]")
    private ExtendedWebElement cartLgoBtn;

    @FindBy(xpath = "//android.widget.Button[@text='Delete']")
    private ExtendedWebElement deleteBtn;

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
