package com.solvd.gui.nopcommerce.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.gui.nopcommerce.web.DesktopsPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {

    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPageOpened();

    public abstract DesktopsPage clickDesktopsBtn();
}
