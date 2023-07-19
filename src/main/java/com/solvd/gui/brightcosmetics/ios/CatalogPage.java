package com.solvd.gui.brightcosmetics.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.gui.brightcosmetics.common.CatalogPageBase;
import com.solvd.gui.brightcosmetics.common.ViewAllPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CatalogPageBase.class)
public class CatalogPage extends CatalogPageBase {

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(accessibilityId = "Item")
    private ExtendedWebElement backBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"View All\"`][1]")
    private ExtendedWebElement facialViewAllBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"View All\"`][2]")
    private ExtendedWebElement haircareAllBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"View All\"`][3]")
    private ExtendedWebElement everythingViewAllBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"Horizontal scroll bar, 3 pages\"`][1]")
    private ExtendedWebElement container;

    @Override
    public boolean isPageOpened() {
        return facialViewAllBtn.isElementPresent();
    }

    @Override
    public void clickBackBtn() {
        backBtn.click();
    }

    @Override
    public ViewAllPageBase clickFacialViewAllBtn() {
        facialViewAllBtn.click();
        return initPage(getDriver(), ViewAllPageBase.class);
    }

    @Override
    public ViewAllPageBase clickHaircareAllBtn() {
        haircareAllBtn.click();
        return initPage(getDriver(), ViewAllPageBase.class);
    }

    @Override
    public ViewAllPageBase clickEverythingViewAllBtn() {
        everythingViewAllBtn.click();
        return initPage(getDriver(), ViewAllPageBase.class);
    }

    @Override
    public void swipeFacialProducts(Direction direction, int duration){
        swipeInContainer(container, direction, duration);
    }

}
