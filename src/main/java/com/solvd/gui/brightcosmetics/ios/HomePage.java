package com.solvd.gui.brightcosmetics.ios;


import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.gui.brightcosmetics.common.CatalogPageBase;
import com.solvd.gui.brightcosmetics.common.HomePageBase;
import com.solvd.gui.saucelabs.common.NavigationPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeIcon[`label == \"brightcosmetics\"`]")
    private ExtendedWebElement app;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Browse Catalog\"`]")
    private ExtendedWebElement catalogBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"More information\"`]")
    private ExtendedWebElement infoBtn;

    @Override
    public boolean isPageOpened() {
        return catalogBtn.isElementPresent();
    }

    @Override
    public void clickApp(){
        app.click();
    }

    @Override
    public CatalogPageBase clickCatalogBtn(){
        catalogBtn.click();
        return initPage(getDriver(), CatalogPageBase.class);
    }

    @Override
    public void clickInfoBtn(){
        infoBtn.click();
    }

}
