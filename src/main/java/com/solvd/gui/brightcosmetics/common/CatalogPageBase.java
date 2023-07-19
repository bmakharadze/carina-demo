package com.solvd.gui.brightcosmetics.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

public abstract class CatalogPageBase extends AbstractPage implements IMobileUtils {
    public CatalogPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickBackBtn();

    public abstract ViewAllPageBase clickFacialViewAllBtn();

    public abstract ViewAllPageBase clickHaircareAllBtn();

    public abstract ViewAllPageBase clickEverythingViewAllBtn();

    public abstract void swipeFacialProducts(Direction direction, int duration);
}
