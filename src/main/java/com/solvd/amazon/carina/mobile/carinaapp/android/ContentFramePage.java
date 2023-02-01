package com.solvd.amazon.carina.mobile.carinaapp.android;

import com.solvd.amazon.carina.mobile.carinaapp.common.ContentFramePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ContentFramePageBase.class)
public class ContentFramePage extends ContentFramePageBase {

    public ContentFramePage(WebDriver driver) {
        super(driver);
    }

}
