package com.solvd.amazon.carina.mobile.browser.desktop;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.browser.common.SearchedProductPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchedProductPage extends SearchedProductPageBase {

    @FindBy(xpath = "//*[@id=\"p_36/2421887011\"]/span/a")
    private ExtendedWebElement priceFromToBtn;

    @FindBy(xpath = "//*[@class=\"a-size-medium a-color-base a-text-normal\"]")
    private ExtendedWebElement chooseProduct;

    public SearchedProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return priceFromToBtn.isElementPresent();
    }

    public ProductsPage openProductsPage() {
        priceFromToBtn.click();
        chooseProduct.click();
        return new ProductsPage(getDriver());
    }
}

