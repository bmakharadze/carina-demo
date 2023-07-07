package com.solvd.gui.saucelabs.common;


import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class QrCodeScannerPageBase extends AbstractPage {
    public QrCodeScannerPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOkBtn();

    public abstract void clickDoNotAllowBtn();
}
