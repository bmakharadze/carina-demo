package com.solvd.amazon.carina.web.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.amazon.carina.web.components.filters.DepartmentsDeal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TodayDealsPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[1]/span")
    private ExtendedWebElement todayDeals;

    @FindBy(xpath = "//span[1][text()='%s']")
    private ExtendedWebElement bookDepartment;

    @FindBy(xpath = "//div[@class='Grid-module__gridDisplayGrid_2X7cDTY7pjoTwwvSRQbt9Y']/div[3]/div/div/a")
    private ExtendedWebElement book;

    public TodayDealsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return todayDeals.isElementPresent(10);
    }

    public void chooseDepartment(DepartmentsDeal departmentsDeal) {
        bookDepartment.format(departmentsDeal.getDepartment()).click();
    }

    public ProductsPage openProductPage() {
        book.click();
        return new ProductsPage(getDriver());
    }

}
