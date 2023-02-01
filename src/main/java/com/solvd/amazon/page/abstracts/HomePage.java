package com.solvd.amazon.page.abstracts;

import com.solvd.amazon.page.AbstractPage;
import com.solvd.amazon.page.first.AmazonHomePage;
import com.solvd.amazon.service.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends AbstractPage {
    private static final Logger LOGGER = LogManager.getLogger(AmazonHomePage.class);

    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL(Configuration.getProperty("url"));
    }

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement searchInput;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input")
    private WebElement changeLanguageButton;

    @FindBy(xpath = "//div[@id='nav-xshop-container']/div/a[1]")
    private WebElement todayDealsButton;

    @FindBy(xpath = "//*[@id=\"nav-cart\"]")
    private WebElement openCart;

    public void writeSearchLine(String input) {
        sendKeys(this.searchInput, input);
    }

    public void clickSearchButton() {
        click(this.searchButton);
    }

    public void clickChangeLanguage() {
        click(this.changeLanguageButton);
        super.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void clickTodayDealsButton() {
        click(this.todayDealsButton);

    }

    public void clickCart() {
        click(openCart);
    }
}
