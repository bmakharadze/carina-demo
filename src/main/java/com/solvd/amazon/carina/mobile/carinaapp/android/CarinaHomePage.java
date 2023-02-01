package com.solvd.amazon.carina.mobile.carinaapp.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.amazon.carina.mobile.carinaapp.common.HomePageBase;
import com.solvd.amazon.carina.mobile.carinaapp.common.RegistrationPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class CarinaHomePage extends HomePageBase {

    @FindBy(id = "next_button")
    private ExtendedWebElement nextBtn;

    public CarinaHomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return nextBtn.isElementPresent();
    }

    @Override
    public RegistrationPageBase clickNextBtn() {
        nextBtn.click();
        return initPage(getDriver(), RegistrationPageBase.class);
    }
}
