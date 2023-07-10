package com.solvd.gui.saucelabs.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.gui.saucelabs.common.DrawingPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DrawingPageBase.class)
public class DrawingPage extends DrawingPageBase {

    public DrawingPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"Vertical scroll bar, 1 page Horizontal scroll bar, 1 page\"`]")
    private ExtendedWebElement container;

    @ExtendedFindBy(accessibilityId = "test-CLEAR")
    private ExtendedWebElement clearBtn;

    @ExtendedFindBy(accessibilityId = "test-SAVE")
    private ExtendedWebElement saveBtn;

    @ExtendedFindBy(accessibilityId = "Select Photos…")
    private ExtendedWebElement selectPhotosBtn;

    @ExtendedFindBy(accessibilityId = "Allow Access to All Photos")
    private ExtendedWebElement allowAccessBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"Horizontal scroll bar, 1 page\"`][2]")
    private ExtendedWebElement doNotAllow;

    @ExtendedFindBy(accessibilityId = "OK")
    private ExtendedWebElement okBtn;

    @Override
    public boolean isPageOpened() {
        return container.isElementPresent();
    }

    @Override
    public void clickSaveBtn() {
        saveBtn.click();
    }

    @Override
    public void clickClearBtn() {
        clearBtn.click();
    }

    @Override
    public void clickSelectPhotosBtn() {
        selectPhotosBtn.click();
    }

    @Override
    public void clickAllowAccessBtn() {
        allowAccessBtn.click();
    }

    @Override
    public void clickDoNotAllow() {
        doNotAllow.click();
    }

    @Override
    public void clickOkBtn() {
        okBtn.click();
    }

    @Override
    public void draw(Direction direction, int duration) {
        swipeInContainer(container, direction, duration);
    }

}