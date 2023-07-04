package com.solvd.gui.saucelabs.common;


import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CartPageBase extends AbstractPage {
    public CartPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickRemoveFromCartBtn();

    public abstract void clickContinueShoppingBtn();

    public abstract void clickCheckoutBtn();
}
