package com.solvd.gui.brightcosmetics.common;


import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage implements IMobileUtils {

    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickApp();

    public abstract CatalogPageBase clickCatalogBtn();

    public abstract void clickInfoBtn();

}