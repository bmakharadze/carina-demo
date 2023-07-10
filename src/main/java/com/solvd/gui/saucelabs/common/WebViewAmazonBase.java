package com.solvd.gui.saucelabs.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class WebViewAmazonBase extends AbstractPage {

    public WebViewAmazonBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeSearch(String search);

    public abstract void clickSearchBtn();

    public abstract void clickProductBtn();

}