package com.solvd.amazon.carina.mobile.browser.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.amazon.carina.mobile.browser.common.SearchedProductPageBase;
import org.openqa.selenium.WebDriver;

public class SearchedProductPage extends SearchedProductPageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeLink[`value == \"2\"`][1]/XCUIElementTypeStaticText")
    private ExtendedWebElement product;

    public SearchedProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return product.isElementPresent();
    }

    public ProductsPage openProductsPage() {
        product.click();
        return new ProductsPage(getDriver());
    }
}
