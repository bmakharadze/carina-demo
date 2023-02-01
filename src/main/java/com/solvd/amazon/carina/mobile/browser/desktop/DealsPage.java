package com.solvd.amazon.carina.mobile.browser.desktop;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.browser.common.DealsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DealsPage extends DealsPageBase {

    @FindBy(xpath = "//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[7]/label/input")
    private ExtendedWebElement submitBtn;

    @FindBy(xpath = "//*[@id=\"grid-main-container\"]/div[3]/div/div[12]/div/div/div/a[2]")
    private ExtendedWebElement chooseProduct;

    public DealsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return submitBtn.isElementPresent();
    }

    @Override
    public void clickProduct() {
        chooseProduct.click();
    }

    @Override
    public ProductsPage openDepartmentPage() {
        submitBtn.click();
        chooseProduct.click();
        return new ProductsPage(getDriver());
    }

}
