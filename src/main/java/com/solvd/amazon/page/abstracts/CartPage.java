package com.solvd.amazon.page.abstracts;

import com.solvd.amazon.page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class CartPage extends AbstractPage {
    @FindBy(xpath = "//div[@class='a-row sc-action-links']/span[2]/span/input")
    private WebElement deleteFromCartButton;

    public CartPage(WebDriver driver) {
        super(driver);
        setPageURL(driver.getCurrentUrl());
    }

    public void clickDeleteFromCartButton() {
        click(deleteFromCartButton);
        super.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
