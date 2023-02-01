package com.solvd.amazon.carina.mobile.browser.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.amazon.carina.mobile.browser.common.DealsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DealsPage extends DealsPageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Departments filter\"`]")
    private ExtendedWebElement departmentBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeSwitch[`value == \"0\"`][7]")
    private ExtendedWebElement chooseDepartment;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Submit\"]")
    private ExtendedWebElement submitBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Disney Dreams Collection by Thomas Kinkade Studios: 2023 Wall Calendar\"`]")
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
