package com.solvd.gui.saucelabs.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.gui.saucelabs.common.GeoLocationPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = GeoLocationPageBase.class)
public class GeoLocationPage extends GeoLocationPageBase {
    public GeoLocationPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(accessibilityId = "Allow Once")
    private ExtendedWebElement allowOnceBtn;

    @ExtendedFindBy(accessibilityId = "Allow While Using App")
    private ExtendedWebElement allowWhileUsingAppBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"Horizontal scroll bar, 1 page\"`][2]")
    private ExtendedWebElement doNotAllowBtn;

    @ExtendedFindBy(accessibilityId = "test-latitude")
    private ExtendedWebElement latitude;

    @ExtendedFindBy(accessibilityId = "test-longitude")
    private ExtendedWebElement longitude;

    @Override
    public boolean isPageOpened() {
        return allowOnceBtn.isElementPresent();
    }
    @Override
    public void clickAllowOnceBtn() {
        allowOnceBtn.click();
    }

    @Override
    public void clickAllowWhileUsingAppBtn() {
        allowWhileUsingAppBtn.click();
    }

    @Override
    public void clickDoNotAllowBtn() {
        doNotAllowBtn.click();
    }

    @Override
    public void getGeoLocation(){
        String lat = latitude.getText();
        String lon = longitude.getText();
        System.out.println("Geo Location is: \n latitude: " + lat + " \n longitude: " + lon);
    }
}