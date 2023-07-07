package com.solvd.gui.saucelabs.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

public abstract class DrawingPageBase extends AbstractPage implements IMobileUtils {
    public DrawingPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickSaveBtn();

    public abstract void clickClearBtn();

    public abstract void clickSelectPhotosBtn();

    public abstract void clickAllowAccessBtn();

    public abstract void clickDoNotAllow();

    public abstract void clickGoBtn();

    public abstract void draw(Direction direction, int duration);

}

