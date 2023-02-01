package com.solvd.amazon.carina.mobile.browser.webview;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.browser.common.DealsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DealsPage extends DealsPageBase {

    @FindBy(xpath = "//*[@aria-label=\"Departments filter\"]")
    private ExtendedWebElement departmentBtn;

    @FindBy(xpath = "//*[@id=\"departments_sheet_content\"]/div/div[2]/ul/li[7]")
    private ExtendedWebElement chooseDepartment;

    @FindBy(xpath = "//*[@class=\"a-button-input\"]")
    private ExtendedWebElement submitBtn;

    @FindBy(xpath = "//*[@id=\"slot-15\"]/div/div/div[3]/div/div[1]/div/div[2]/div/div/a")
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
