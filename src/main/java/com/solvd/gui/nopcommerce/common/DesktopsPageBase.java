package com.solvd.gui.nopcommerce.common;


import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.gui.nopcommerce.web.ProductPage;
import org.openqa.selenium.WebDriver;

public abstract class DesktopsPageBase extends AbstractPage {

    public DesktopsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPageOpened();

    public abstract ProductPage clickProduct();
}
