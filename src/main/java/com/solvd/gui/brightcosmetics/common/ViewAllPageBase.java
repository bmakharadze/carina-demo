package com.solvd.gui.brightcosmetics.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

public abstract class ViewAllPageBase extends AbstractPage implements IMobileUtils {

    public ViewAllPageBase(WebDriver driver) {
            super(driver);
        }

    public abstract void clickBackBtn();

    public abstract ProductPageBase clickProductBtn();

}
