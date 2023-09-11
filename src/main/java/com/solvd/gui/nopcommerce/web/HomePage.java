package com.solvd.gui.nopcommerce.web;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.gui.nopcommerce.common.HomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends HomePageBase{

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[2]/div[1]/h2")
    private ExtendedWebElement desktopsBtn;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://demo.nopcommerce.com/");
    }

    @Override
    public boolean isPageOpened() {
        return desktopsBtn.isElementPresent();
    }

}