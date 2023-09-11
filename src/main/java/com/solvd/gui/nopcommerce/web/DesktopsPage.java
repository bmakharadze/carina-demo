package com.solvd.gui.nopcommerce.web;


import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.gui.nopcommerce.common.DesktopsPageBase;
import com.solvd.gui.nopcommerce.common.HomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends DesktopsPageBase {

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/h2/a")
    private ExtendedWebElement productBtn;

    public DesktopsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return productBtn.isElementPresent();
    }

}
