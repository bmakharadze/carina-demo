package com.solvd.amazon.carina.mobile.browser.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.browser.common.ProductsPageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends ProductsPageBase implements IMobileUtils {

    @FindBy(xpath = "//android.widget.Button[@resource-id='add-to-cart-button']")
    private ExtendedWebElement submitBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView")
    private ExtendedWebElement container;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return submitBtn.isElementPresent();
    }

    public CartPage openCartPage() {
        swipe(submitBtn, container, 5);
        submitBtn.click();
        return new CartPage(getDriver());
    }

}
