package com.solvd.amazon.carina.mobile.browser.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {

    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPageOpened();

    public abstract DealsPageBase openDealsPage();

    public abstract CartPageBase openCartPage();

    public abstract SearchedProductPageBase openSearchedProductPage();

    public abstract void clickDealsBtn();

    public abstract void clickCartBtn();

    public abstract void typeSearchInput();

    public abstract void clickSearchInputBtn();
}
