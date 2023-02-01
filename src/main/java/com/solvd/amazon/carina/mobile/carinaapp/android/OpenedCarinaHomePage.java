package com.solvd.amazon.carina.mobile.carinaapp.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.carinaapp.common.ContentFramePageBase;
import com.solvd.amazon.carina.mobile.carinaapp.common.OpenedCarinaHomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = OpenedCarinaHomePageBase.class)
public class OpenedCarinaHomePage extends OpenedCarinaHomePageBase {

    @FindBy(id = "content_frame")
    private ExtendedWebElement contentFrame;

    public OpenedCarinaHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContentFramePageBase clickContentFrame() {
        contentFrame.click();
        return initPage(getDriver(), ContentFramePageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return contentFrame.isElementPresent();
    }
}
