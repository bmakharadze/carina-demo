package com.solvd.gui.saucelabs.common;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.gui.saucelabs.components.Filters;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage implements IMobileUtils {

    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void filterBy(Filters filterBy);

    public abstract void clickAddToCartBtn(String product);

    public abstract void clickRemoveBtn(String product);

    public abstract void clickFilterBtn();

    public abstract void clickSortByListBtn();

    public abstract CartPageBase clickCartBtn();

    public abstract ProductPageBase clickProduct(String productName);

    public abstract NavigationPageBase clickNavigationBtn();

    public abstract void dragAndDrop();
}