package com.solvd.amazon.carina.mobile.browser.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class DealsPageBase extends AbstractPage {
    public DealsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPageOpened();

    public abstract ProductsPageBase openDepartmentPage();

    public abstract void clickProduct();
}
