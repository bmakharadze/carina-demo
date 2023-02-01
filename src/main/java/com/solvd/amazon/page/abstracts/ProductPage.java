package com.solvd.amazon.page.abstracts;

import com.solvd.amazon.page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class ProductPage extends AbstractPage {
    @FindBy(xpath = "//div[@class='a-button-stack']/span/span/span/input")
    private WebElement addToCart;

    public ProductPage(WebDriver driver) {
        super(driver);
        setPageURL(driver.getCurrentUrl());
    }

    public void clickAddToCart() {
        click(addToCart);
        super.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
