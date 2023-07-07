package com.solvd.gui.saucelabs.ios;


import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.gui.saucelabs.common.WebViewAmazonBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = WebViewAmazonBase.class)
public class WebViewAmazonPage extends WebViewAmazonBase {
    public WebViewAmazonPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(accessibilityId = "Search Amazon")
    private ExtendedWebElement searchInput;

    @ExtendedFindBy(accessibilityId = "Go")
    private ExtendedWebElement searchBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeLink[`value == \"2\"`][1]/XCUIElementTypeStaticText")
    private ExtendedWebElement productBtn;

    @Override
    public void typeSearch(String search){
        searchInput.type(search);
    }

    @Override
    public void clickSearchBtn(){
        searchBtn.click();
    }

    @Override
    public void clickProductBtn(){
        productBtn.click();
    }


}