package com.solvd.gui.saucelabs.ios;

import com.solvd.gui.saucelabs.common.CartPageBase;
import com.solvd.gui.saucelabs.common.HomePageBase;
import com.solvd.gui.saucelabs.common.NavigationPageBase;
import com.solvd.gui.saucelabs.common.ProductPageBase;
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

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[$type == 'XCUIElementTypeStaticText' AND name == 'test-Item title' AND label == '%s'$][-3]")
    private ExtendedWebElement product;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == 'ADD TO CART'`][%s]")
    private ExtendedWebElement productAddToCartBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`label == \"REMOVE\"`][%s]")
    private ExtendedWebElement productRemoveBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Toggle\"`]")
    private ExtendedWebElement sortByListBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Modal Selector Button\"`]/XCUIElementTypeOther/XCUIElementTypeOther")
    private ExtendedWebElement filterBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Cart\"`]/XCUIElementTypeOther")
    private ExtendedWebElement cartBtn;

    @Override
    public boolean isPageOpened() {
        return cartBtn.isElementPresent();
    }

    @Override
    public void clickAddToCartBtn(String product) {
        switch (product) {
            case "Sauce Labs Backpack": {
                String productId = "1";
                productAddToCartBtn.format(productId).click();
                break;
            }
            case "Sauce Labs Bike Light": {
                String productId = "2";
                productAddToCartBtn.format(productId).click();
                break;
            }
            case "Sauce Labs Bolt T-Shirt": {
                String productId = "3";
                productAddToCartBtn.format(productId).click();
                break;
            }
            case "Sauce Labs Fleece Jacket": {
                String productId = "4";
                productAddToCartBtn.format(productId).click();
                break;
            }
        }

    }

    @Override
    public void clickRemoveBtn(String product) {
        if (product.equals("Sauce Labs Backpack")) {
            String productId = "1";
            productRemoveBtn.format(productId).click();
        } else if (product.equals("Sauce Labs Bike Light")) {
            String productId = "2";
            productRemoveBtn.format(productId).click();
        } else if (product.equals("Sauce Labs Bolt T-Shirt")) {
            String productId = "3";
            productRemoveBtn.format(productId).click();
        } else if (product.equals("Sauce Labs Fleece Jacket")) {
            String productId = "4";
            productRemoveBtn.format(productId).click();
        }
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
    public void filterBy(Filters filterBy) {
        filter.format(filterBy.getFilter()).click();
    }

    @Override
    public CartPageBase clickCartBtn() {
        cartBtn.click();
        return initPage(getDriver(), CartPageBase.class);
    }

    @Override
    public ProductPageBase clickProduct(String productName) {
        product.format(productName).click();
        return initPage(getDriver(), ProductPageBase.class);
    }

    @Override
    public NavigationPageBase clickNavigationBtn() {
        navigationBtn.click();
        return initPage(getDriver(), NavigationPageBase.class);
    }


}