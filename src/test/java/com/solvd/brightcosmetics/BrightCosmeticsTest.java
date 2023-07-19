package com.solvd.brightcosmetics;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.gui.brightcosmetics.common.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrightCosmeticsTest implements IAbstractTest {

    @Test
    public void checkoutTest(){
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.clickApp();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        CatalogPageBase catalogPage = homePage.clickCatalogBtn();
        Assert.assertTrue(catalogPage.isPageOpened(), "Catalog page is not opened");
        catalogPage.clickFacialViewAllBtn();
        ViewAllPageBase allProductsPage = initPage(getDriver(), ViewAllPageBase.class);
        Assert.assertTrue(allProductsPage.isPageOpened(), "All products page is not opened");
        ProductPageBase productPage = allProductsPage.clickProductBtn();
        Assert.assertTrue(productPage.isPageOpened(), "Catalog page is not opened");
        CartPageBase cartPage = productPage.clickAddToCartBtn();
        Assert.assertTrue(cartPage.isPageOpened(), "Cart page is not opened");
        CheckoutPageBase checkoutPage = cartPage.clickCheckoutBtn();
        Assert.assertTrue(checkoutPage.isPageOpened(), "Checkout page is not opened");
        checkoutPage.typeEmail("s@gmail.com");
        checkoutPage.typeName("Becca");
    }

    @Test
    public void deleteFromCartTest(){
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.clickApp();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        CatalogPageBase catalogPage = homePage.clickCatalogBtn();
        Assert.assertTrue(catalogPage.isPageOpened(), "Catalog page is not opened");
        catalogPage.clickFacialViewAllBtn();
        ViewAllPageBase allProductsPage = initPage(getDriver(), ViewAllPageBase.class);
        Assert.assertTrue(allProductsPage.isPageOpened(), "All products page is not opened");
        ProductPageBase productPage = allProductsPage.clickProductBtn();
        Assert.assertTrue(productPage.isPageOpened(), "Catalog page is not opened");
        CartPageBase cartPage = productPage.clickAddToCartBtn();
        Assert.assertTrue(cartPage.isPageOpened(), "Cart page is not opened");
        cartPage.clickRemoveFromCartBtn();
    }

}
