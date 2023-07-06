package com.solvd.gui.saucelabs.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.gui.saucelabs.common.WebViewPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = WebViewPageBase.class)
public class WebViewPage extends WebViewPageBase {
    public WebViewPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(accessibilityId = "test-enter a https url here...")
    private ExtendedWebElement urlInput;

    @ExtendedFindBy(accessibilityId = "test-GO TO SITE")
    private ExtendedWebElement goToSiteBtn;

    @Override
    public boolean isPageOpened() {
        return goToSiteBtn.isElementPresent();
    }

    @Override
    public void urlInput(String url) {
        urlInput.type(url);
    }

    @Override
    public void clickGoToSiteBtn() {
        goToSiteBtn.click();
    }

}