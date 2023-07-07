package com.solvd.gui.saucelabs.ios;

import com.solvd.gui.saucelabs.common.*;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = NavigationPageBase.class)
public class NavigationPage extends NavigationPageBase {
    public NavigationPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(accessibilityId = "test-ALL ITEMS")
    private ExtendedWebElement allItemsBtn;

    @ExtendedFindBy(accessibilityId = "test-WEBVIEW")
    private ExtendedWebElement webViewBtn;

    @ExtendedFindBy(accessibilityId = "test-QR CODE SCANNER")
    private ExtendedWebElement qrCodeScannerBtn;

    @ExtendedFindBy(accessibilityId = "test-GEO LOCATION")
    private ExtendedWebElement geoLocationBtn;

    @ExtendedFindBy(accessibilityId = "test-DRAWING")
    private ExtendedWebElement drawingBtn;

    @ExtendedFindBy(accessibilityId = "test-ABOUT")
    private ExtendedWebElement aboutBtn;

    @ExtendedFindBy(accessibilityId = "test-LOGOUT")
    private ExtendedWebElement logOutBtn;

    @ExtendedFindBy(accessibilityId = "test-RESET APP STATE")
    private ExtendedWebElement resetAppBtn;

    @ExtendedFindBy(accessibilityId = "test-Close")
    private ExtendedWebElement closeBtn;

    @Override
    public boolean isPageOpened() {
        return allItemsBtn.isElementPresent();
    }

    @Override
    public HomePageBase clickAllItemsBtn() {
        allItemsBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }

    @Override
    public WebViewPageBase clickWebViewBtn() {
        webViewBtn.click();
        return initPage(getDriver(), WebViewPageBase.class);
    }

    @Override
    public QrCodeScannerPageBase clickQrCodeScannerBtn() {
        qrCodeScannerBtn.click();
        return initPage(getDriver(), QrCodeScannerPageBase.class);
    }

    @Override
    public GeoLocationPageBase clickGeoLocationBtn() {
        geoLocationBtn.click();
        return initPage(getDriver(), GeoLocationPageBase.class);
    }

    @Override
    public DrawingPageBase clickDrawingBtn() {
        drawingBtn.click();
        return initPage(getDriver(), DrawingPageBase.class);
    }

    @Override
    public void clickAboutBtn() {
        aboutBtn.click();
    }

    @Override
    public void clickLogOutBtn() {
        logOutBtn.click();
    }

    @Override
    public void clickResetAppBtn() {
        resetAppBtn.click();
    }

    @Override
    public void clickCloseBtn() {
        closeBtn.click();
    }

}