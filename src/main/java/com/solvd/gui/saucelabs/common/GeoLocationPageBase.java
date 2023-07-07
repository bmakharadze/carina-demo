package com.solvd.gui.saucelabs.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class GeoLocationPageBase extends AbstractPage {
    public GeoLocationPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickAllowOnceBtn();

    public abstract void clickAllowWhileUsingAppBtn();

    public abstract void clickDoNotAllowBtn();

    public abstract void getGeoLocation();
}

