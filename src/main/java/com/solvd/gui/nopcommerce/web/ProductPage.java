package com.solvd.gui.nopcommerce.web;


import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.gui.nopcommerce.common.DesktopsPageBase;
import com.solvd.gui.nopcommerce.common.HomePageBase;
import com.solvd.gui.nopcommerce.common.ProductPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends ProductPageBase {

    @FindBy(xpath = "//*[@class=\"add-to-cart\"]/div/button")
    private ExtendedWebElement addToCartBtn;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return addToCartBtn.isElementPresent();
    }

    @Override
    public void clickAddToCartBtn() {
        addToCartBtn.click();

    }


}
