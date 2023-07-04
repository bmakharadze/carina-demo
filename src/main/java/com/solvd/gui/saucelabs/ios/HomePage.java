package com.solvd.gui.saucelabs.ios;

import com.solvd.gui.saucelabs.common.CartPageBase;
import com.solvd.gui.saucelabs.common.HomePageBase;
import com.solvd.gui.saucelabs.common.NavigationPageBase;
import com.solvd.gui.saucelabs.components.Filters;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == '%s'`]")
    private ExtendedWebElement filter;

    @ExtendedFindBy(accessibilityId = "test-Menu")
    private ExtendedWebElement navigationBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == 'PRODUCTS'`]")
    private ExtendedWebElement productsTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"ADD TO CART\"`][2]")
    private ExtendedWebElement productAddToCartBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"REMOVE\"`][2]")
    private ExtendedWebElement productRemoveBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Toggle\"`]")
    private ExtendedWebElement sortByListBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Modal Selector Button\"`]/XCUIElementTypeOther/XCUIElementTypeOther")
    private ExtendedWebElement filterBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Cart\"`]/XCUIElementTypeOther")
    private ExtendedWebElement cartBtn;

    @Override
    public boolean isPageOpened() {
        return productsTitle.isElementPresent();
    }

    @Override
    public NavigationPageBase clickNavigationBtn() {
        navigationBtn.click();
        return initPage(getDriver(), NavigationPageBase.class);
    }

    @Override
    public void clickAddToCartBtn(String product) {
        productAddToCartBtn.format(product).click();
    }

    @Override
    public void clickRemoveBtn(String product) {
        productRemoveBtn.format(product).click();
    }

    @Override
    public void clickSortByListBtn(){
        sortByListBtn.click();
    }

    @Override
    public void clickFilterBtn() {
        filterBtn.click();
    }

    @Override
    public CartPageBase clickCartBtn() {
        cartBtn.click();
        return initPage(getDriver(), CartPageBase.class);
    }

    @Override
    public void filterBy(Filters filterBy) {
        filter.format(filterBy.getFilter()).click();
    }

    @Override
    public boolean isAddToCartBtnPresent(String product) {
        return productAddToCartBtn.format(product).isElementPresent();
    }

    @Override
    public boolean isRemoveBtnPresent(String product) {
        return productRemoveBtn.format(product).isElementPresent();
    }

}