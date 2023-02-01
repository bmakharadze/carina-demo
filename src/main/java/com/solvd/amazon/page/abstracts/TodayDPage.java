package com.solvd.amazon.page.abstracts;

import com.solvd.amazon.page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class TodayDPage extends AbstractPage {
    @FindBy(xpath = "//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[7]/label/input")
    private WebElement booksButton;

    @FindBy(xpath = "//div[@class='Grid-module__gridDisplayGrid_2X7cDTY7pjoTwwvSRQbt9Y']/div/div/div/a")
    private WebElement book;

    public TodayDPage(WebDriver driver) {
        super(driver);
        setPageURL(driver.getCurrentUrl());
    }

    public void clickBooksButton() {
        click(booksButton);
    }

    public void clickBook() {
        click(book);
    }

}
