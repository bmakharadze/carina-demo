package com.solvd.gui.brightcosmetics.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

public abstract class CartPageBase extends AbstractPage implements IMobileUtils {

    public CartPageBase(WebDriver driver) {
        super(driver);
    }


    public abstract void clickKeepShoppingBtn();

    public abstract CheckoutPageBase clickCheckoutBtn();

    public abstract void clickRemoveFromCartBtn();
}
