package com.solvd.amazon.carina.mobile.carinaapp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class OpenedCarinaHomePageBase extends AbstractPage {

    public OpenedCarinaHomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract ContentFramePageBase clickContentFrame();

}
