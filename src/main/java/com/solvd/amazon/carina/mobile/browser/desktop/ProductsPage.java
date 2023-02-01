package com.solvd.amazon.carina.mobile.browser.desktop;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.browser.common.ProductsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends ProductsPageBase {

    @FindBy(xpath = "//div[@class='a-button-stack']/span/span/span/input")
    private ExtendedWebElement submitBtn;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return submitBtn.isElementPresent();
    }

    public CartPage openCartPage() {
        submitBtn.click();
        return new CartPage(getDriver());
    }

}
