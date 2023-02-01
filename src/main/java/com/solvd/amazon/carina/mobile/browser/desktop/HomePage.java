package com.solvd.amazon.carina.mobile.browser.desktop;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.browser.common.HomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class HomePage extends HomePageBase {
    
    @FindBy(xpath = "//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input")
    private ExtendedWebElement changeBtn;

    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
    private ExtendedWebElement dealsBtn;

    @FindBy(xpath = "//*[@id=\"nav-cart\"]")
    private ExtendedWebElement cartBtn;

    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    private ExtendedWebElement searchInput;

    @FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
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
        changeBtn.click();
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
