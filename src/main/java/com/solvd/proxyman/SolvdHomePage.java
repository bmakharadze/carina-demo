package com.solvd.proxyman;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SolvdHomePage extends AbstractPage {
    public SolvdHomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://www.solvd.com/");
    }
}
