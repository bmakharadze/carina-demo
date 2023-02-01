package com.solvd.amazon.carina.mobile.browser.webview;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.browser.common.ProductsPageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends ProductsPageBase implements IMobileUtils {

    @FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
    private ExtendedWebElement submitBtn;

    @FindBy(xpath = "//*[@id=\"dp\"]")
    private ExtendedWebElement container;

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
