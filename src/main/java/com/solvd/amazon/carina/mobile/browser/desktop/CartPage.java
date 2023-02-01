package com.solvd.amazon.carina.mobile.browser.desktop;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.browser.common.CartPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartPage extends CartPageBase {

    @FindBy(xpath = "//div[@class='a-row sc-action-links']/span[2]/span/input")
    private ExtendedWebElement deleteBtn;

    @FindBy(xpath = "//*[@id=\"nav-cart\"]")
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