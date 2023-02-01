package com.solvd.amazon.carina.mobile.browser.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.amazon.carina.mobile.browser.common.HomePageBase;
import org.openqa.selenium.WebDriver;

public class HomePage extends HomePageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Deals\"`]")
    private ExtendedWebElement dealsBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeLink[`label == \"Cart\"`]")
    private ExtendedWebElement cartBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`label == \"Search Amazon\"`]")
    private ExtendedWebElement searchInput;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Go\"`]")
    private ExtendedWebElement searchInputBtn;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://amazon.com/");
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
