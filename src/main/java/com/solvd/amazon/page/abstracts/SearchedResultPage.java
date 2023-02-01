package com.solvd.amazon.page.abstracts;

import com.solvd.amazon.page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchedResultPage extends AbstractPage {
    @FindBy(xpath = "//*[@class=\"a-size-medium a-color-base a-text-normal\"]")
    private WebElement product;

    //Should be /a instead of /h1.
    //Did this so error Screenshot would be visible.
    //                                                  \/
    @FindBy(xpath = " //*[@id=\"p_36/2421887011\"]/span/a")
    private WebElement changePrice;

    public SearchedResultPage(WebDriver driver) {
        super(driver);
        setPageURL(driver.getCurrentUrl());
    }

    public void clickChangePrice() {
        click(changePrice);
    }

    public void clickProduct() {
        getTitle(product);
        click(product);
    }
}