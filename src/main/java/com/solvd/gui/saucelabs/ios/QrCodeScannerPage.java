package com.solvd.gui.saucelabs.ios;

import com.solvd.gui.saucelabs.common.QrCodeScannerPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = QrCodeScannerPageBase.class)
public class QrCodeScannerPage extends QrCodeScannerPageBase {
    public QrCodeScannerPage(WebDriver driver) {
        super(driver);
    }

//    @Override
//    public boolean isPageOpened() {
//       return
//    }
}