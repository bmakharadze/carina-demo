package com.solvd.gui.saucelabs.common;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.gui.saucelabs.components.Filters;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {

    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void filterBy(Filters filterBy);

    public abstract void clickAddToCartBtn(String product);

    public abstract void clickRemoveBtn(String product);

    public abstract void clickFilterBtn();

    public abstract void clickSortByListBtn();

    public abstract CartPageBase clickCartBtn();

    public abstract NavigationPageBase clickNavigationBtn();

    public abstract boolean isAddToCartBtnPresent(String product);

    public abstract boolean isRemoveBtnPresent(String product);

}