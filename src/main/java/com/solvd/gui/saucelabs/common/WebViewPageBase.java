package com.solvd.gui.saucelabs.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class WebViewPageBase extends AbstractPage {

    public WebViewPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void urlInput(String url);

    public abstract WebViewAmazonBase clickGoToSiteBtn();

}