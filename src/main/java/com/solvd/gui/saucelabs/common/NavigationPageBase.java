package com.solvd.gui.saucelabs.common;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class NavigationPageBase extends AbstractPage {
    public NavigationPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract HomePageBase clickAllItemsBtn();

    public abstract WebViewPageBase clickWebViewBtn();

    public abstract QrCodeScannerPageBase clickQrCodeScannerBtn();

    public abstract GeoLocationPageBase clickGeoLocationBtn();

    public abstract DrawingPageBase clickDrawingBtn();

    public abstract void clickAboutBtn();

    public abstract void clickLogOutBtn();

    public abstract void clickResetAppBtn();


    public abstract void clickCloseBtn();
}