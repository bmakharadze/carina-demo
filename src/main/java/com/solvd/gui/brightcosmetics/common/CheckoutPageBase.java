package com.solvd.gui.brightcosmetics.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

public abstract class CheckoutPageBase extends AbstractPage implements IMobileUtils {

    public CheckoutPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeEmail(String email);

    public abstract void typeName(String name);
}
