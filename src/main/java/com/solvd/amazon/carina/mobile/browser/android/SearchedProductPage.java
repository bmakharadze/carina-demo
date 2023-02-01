package com.solvd.amazon.carina.mobile.browser.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.browser.common.SearchedProductPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchedProductPage extends SearchedProductPageBase {

    @FindBy(xpath = "//android.widget.ToggleButton[@text=\"Filters\"]")
    private ExtendedWebElement filtersBtn;

    @FindBy(xpath = "//android.view.View[@text='Price & Deals']")
    private ExtendedWebElement priceBtn;

    @FindBy(xpath = "//android.view.View[@content-desc=\"$500 to $600\"]")
    private ExtendedWebElement priceFromToBtn;

    @FindBy(xpath = "//android.view.View[@contains(@text,'Show')]")
    private ExtendedWebElement showBtn;

    @FindBy(xpath = "//android.view.View[@text='Lenovo Flex 5 Laptop, 14.0\" FHD Touch Display, AMD Ryzen 5 5500U, 16GB RAM, 512GB Storage, AMD Radeon Graphics, Windows 11 Home, Graphite Grey']")
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

