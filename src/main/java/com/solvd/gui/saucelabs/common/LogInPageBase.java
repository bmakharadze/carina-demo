package com.solvd.gui.saucelabs.common;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LogInPageBase extends AbstractPage {

    public LogInPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeUserName(String username);

    public abstract void typePassword(String password);

    public abstract void login(String username, String password);

    public abstract HomePageBase clickLogInBtn();


}