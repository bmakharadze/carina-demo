package com.solvd.gui.saucelabs.common;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {

    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickAddToCartBtn(String product);

    public abstract void clickRemoveBtn(String product);

    public abstract boolean isAddToCartBtnPresent(String product);

    public abstract boolean isRemoveBtnPresent(String product);

}