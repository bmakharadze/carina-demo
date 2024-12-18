package com.solvd.amazon.carina.web.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.amazon.carina.web.components.filters.PriceEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchedResultPage extends AbstractPage {

    private static final Logger LOGGER = LogManager.getLogger(SearchedResultPage.class);

    //clicking first product from search
    @FindBy(xpath = "//*[@class=\"a-size-medium a-color-base a-text-normal\"]")
    private List<ExtendedWebElement> productsList;

    @FindBy(xpath = "//*[@class=\"a-size-medium a-color-base a-text-normal\"]")
    private ExtendedWebElement specProduct;

    @FindBy(xpath = "//span[text()='%s']")
    private ExtendedWebElement priceFilter;

    public SearchedResultPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return specProduct.isElementPresent(10);
    }

    public ProductsPage clickProduct() {
        specProduct.click();
        return new ProductsPage(getDriver());
    }

    public void getAllProducts() {
        productsList.forEach(e -> LOGGER.info(e.getText()));
    }

    public void choosePriceFilters(PriceEnum price) {
        priceFilter.format(price.getPrice()).click();
    }

}
