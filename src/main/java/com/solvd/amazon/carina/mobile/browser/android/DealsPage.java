package com.solvd.amazon.carina.mobile.browser.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.browser.common.DealsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DealsPage extends DealsPageBase {

    @FindBy(xpath = "//android.view.View[@content-desc=\"Departments filter\"]")
    private ExtendedWebElement departmentBtn;

    @FindBy(xpath = "//android.view.View[@index='6']")
    private ExtendedWebElement chooseDepartment;

    @FindBy(xpath = "//android.widget.Button[@index='0']")
    private ExtendedWebElement submitBtn;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Berserk Deluxe Volume 1\"]")
    private ExtendedWebElement chooseProduct;

    public DealsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return departmentBtn.isElementPresent();
    }

    @Override
    public void clickProduct() {
        chooseProduct.click();
    }

    @Override
    public ProductsPage openDepartmentPage() {
        departmentBtn.click();
        chooseDepartment.click();
        submitBtn.click();
        chooseProduct.click();
        return new ProductsPage(getDriver());
    }

}
