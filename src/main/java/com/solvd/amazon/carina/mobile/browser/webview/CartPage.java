package com.solvd.amazon.carina.mobile.browser.webview;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.browser.common.CartPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartPage extends CartPageBase {

    @FindBy(xpath = "//*[@aria-labelledby=\"a-autoid-2-announce\"]")
    private ExtendedWebElement deleteBtn;

    @FindBy(xpath = "//a[@aria-label='Cart']")
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