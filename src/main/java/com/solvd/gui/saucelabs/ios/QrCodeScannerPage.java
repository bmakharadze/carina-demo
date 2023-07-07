package com.solvd.gui.saucelabs.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.gui.saucelabs.common.QrCodeScannerPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = QrCodeScannerPageBase.class)
public class QrCodeScannerPage extends QrCodeScannerPageBase {
    public QrCodeScannerPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(accessibilityId = "OK")
    private ExtendedWebElement okBtn;

    @ExtendedFindBy(accessibilityId = "OK")
    private ExtendedWebElement doNotAllow;

    @Override
    public boolean isPageOpened() {
       return okBtn.isElementPresent();
    }

    @Override
    public void clickOkBtn() {
        okBtn.click();
    }

    @Override
    public void clickDoNotAllowBtn() {
        doNotAllow.click();
    }

}