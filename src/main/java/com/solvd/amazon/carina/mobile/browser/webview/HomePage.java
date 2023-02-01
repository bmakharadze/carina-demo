package com.solvd.amazon.carina.mobile.browser.webview;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.browser.common.HomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class HomePage extends HomePageBase {

    @FindBy(xpath = "//div[@id='nav-gwbar']/a[1]")
    private ExtendedWebElement dealsBtn;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Deals\"]")
    private ExtendedWebElement logo;

    @FindBy(xpath = "//a[@aria-label='Cart']")
    private ExtendedWebElement cartBtn;

    @FindBy(xpath = "//input[@id='nav-search-keywords']")
    private ExtendedWebElement searchInput;

    @FindBy(xpath = "//input[@aria-label='Go']")
    private ExtendedWebElement searchInputBtn;

    @Override
    public SearchedProductPage openSearchedProductPage() {
        searchInput.type("Laptop");
        searchInputBtn.click();
        return new SearchedProductPage(getDriver());
    }

    public HomePage(WebDriver driver) {
        super(driver);

    }

    @Override
    public boolean isPageOpened() {
        return logo.isElementPresent();
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
