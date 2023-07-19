package com.solvd.gui.brightcosmetics.ios;


import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.gui.brightcosmetics.common.CartPageBase;
import com.solvd.gui.brightcosmetics.common.ProductPageBase;
import com.solvd.gui.brightcosmetics.common.ViewAllPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ViewAllPageBase.class)
public class ViewAllPage extends ViewAllPageBase {

    public ViewAllPage(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(accessibilityId = "Item")
    private ExtendedWebElement backBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Oil-Free Moisturiser\"`][2]")
    private ExtendedWebElement productBtn;

    @Override
    public boolean isPageOpened() {
        return productBtn.isElementPresent();
    }

    @Override
    public void clickBackBtn() {
        backBtn.click();
    }

    @Override
    public ProductPageBase clickProductBtn() {
        productBtn.click();
        return initPage(getDriver(), ProductPageBase.class);
    }

}
