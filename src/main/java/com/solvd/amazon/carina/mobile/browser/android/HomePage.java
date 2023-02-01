package com.solvd.amazon.carina.mobile.browser.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.browser.common.HomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class HomePage extends HomePageBase {

    @FindBy(xpath = "//android.view.View[@content-desc=\"Deals\"]")
    private ExtendedWebElement dealsBtn;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Cart\"]")
    private ExtendedWebElement cartBtn;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"nav-search-keywords\"]")
    private ExtendedWebElement searchInput;

    //could not find other way to inspect this element
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View")
    private ExtendedWebElement searchInputBtn;

    public HomePage(WebDriver driver) {
        super(driver);

    }

    @Override
    public boolean isPageOpened() {
        return dealsBtn.isElementPresent();
    }

    @Override
    public DealsPage openDealsPage() {
        dealsBtn.click();
        return new DealsPage(getDriver());
    }

    @Override
    public CartPage openCartPage() {
        cartBtn.click();
        return new CartPage(getDriver());
    }

    @Override
    public SearchedProductPage openSearchedProductPage() {
        searchInput.type("Laptop");
        searchInputBtn.click();
        return new SearchedProductPage(getDriver());
    }

    @Override
    public void clickCartBtn() {
        cartBtn.click();
    }

    @Override
    public void clickDealsBtn() {
        dealsBtn.click();
    }

    @Override
    public void typeSearchInput() {
        searchInput.type("Laptop");
    }

    @Override
    public void clickSearchInputBtn() {
        searchInputBtn.click();
    }
}
