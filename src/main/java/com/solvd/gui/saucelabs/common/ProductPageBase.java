package com.solvd.gui.saucelabs.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

public abstract class ProductPageBase extends AbstractPage implements IMobileUtils {

    public ProductPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickAddToCart();

    public abstract void getPrice();

}
