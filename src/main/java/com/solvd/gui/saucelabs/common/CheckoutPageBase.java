package com.solvd.gui.saucelabs.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

public abstract class CheckoutPageBase extends AbstractPage implements IMobileUtils{

    public CheckoutPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickContinueBtn();

    public abstract void fillCheckoutInputs(String firstName, String lastName, String zipCode);

    public abstract void clickFinishBtn();

}
