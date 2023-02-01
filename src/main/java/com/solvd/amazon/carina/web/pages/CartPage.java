package com.solvd.amazon.carina.web.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"sc-active-cart\"]/div/div/div/h1")
    private ExtendedWebElement cartPage;

    @FindBy(xpath = "//div[@class='a-row sc-action-links']/span[2]/span/input")
    private ExtendedWebElement deleteFromCartBtn;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return cartPage.isElementPresent(10);
    }

    public boolean isItemPresent() {
        return deleteFromCartBtn.isElementPresent(10);
    }

    public void clickDeleteFromCartBtn() {
        deleteFromCartBtn.click();
    }

}
