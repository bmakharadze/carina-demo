package com.solvd.amazon.carina.mobile.browser.webview;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.browser.common.SearchedProductPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchedProductPage extends SearchedProductPageBase {

    @FindBy(xpath = "//span[@id='s-all-filters']")
    private ExtendedWebElement filtersBtn;

    @FindBy(xpath = "//div[@id='priceRefinements']/span[1]")
    private ExtendedWebElement priceBtn;

    @FindBy(xpath = "//a[@id='p_36/2421887011']")
    private ExtendedWebElement priceFromToBtn;

    @FindBy(xpath = "//a[@class='a-link-normal sf-bottom-nav-btn aok-float-right sf-show-results']")
    private ExtendedWebElement showBtn;

    @FindBy(xpath = "//div[@class='sg-col-inner']/div/span/a/div/h2")
    private ExtendedWebElement chooseProduct;

    public SearchedProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return filtersBtn.isElementPresent();
    }

    public ProductsPage openProductsPage() {
        filtersBtn.click();
        if (priceBtn.isElementPresent(5)) {
            priceBtn.click();
            priceFromToBtn.click();
        } else {
            priceFromToBtn.click();
        }
        showBtn.click();
        chooseProduct.click();
        return new ProductsPage(getDriver());
    }
}

