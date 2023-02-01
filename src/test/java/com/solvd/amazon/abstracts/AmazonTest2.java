package com.solvd.amazon.abstracts;

import com.solvd.amazon.AbstractTest;
import com.solvd.amazon.page.abstracts.*;
import com.solvd.amazon.service.WebDriverPool;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
public class AmazonTest2 extends AbstractTest {
    private static final Logger LOGGER = LogManager.getLogger(AmazonTest2.class);
    @Test
    public void booksTest() throws IOException {
        WebDriver driver = WebDriverPool.get();
        try {
            HomePage homePage = new HomePage(driver);
            homePage.open();
            homePage.clickChangeLanguage();
            homePage.clickTodayDealsButton();

            //Some products do not have ADD TO CART button.
            TodayDPage todayDPage = new TodayDPage(driver);
            todayDPage.clickBooksButton();
            todayDPage.clickBook();

            ProductPage productPage = new ProductPage(driver);
            productPage.clickAddToCart();
            homePage.clickCart();

            CartPage cartPage = new CartPage(driver);
            cartPage.clickDeleteFromCartButton();
        } catch (Exception e) {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("/Users/bekamakharadze/IdeaProjects/EducationPlanTests/src/test/resources/error.png"));
            LOGGER.info("Error, check the image at: /Users/bekamakharadze/IdeaProjects/EducationPlanTests/src/test/resources/error.png");
        }
    }

    @Test
    public void checkSearchTest() throws IOException {
        WebDriver driver = WebDriverPool.get();
        try{
            HomePage homePage = new HomePage(driver);
            homePage.open();
            homePage.writeSearchLine("Laptop");
            homePage.clickSearchButton();

            SearchedResultPage searchedResultPage = new SearchedResultPage(driver);
            searchedResultPage.clickChangePrice();
            searchedResultPage.clickProduct();

            ProductPage productPage = new ProductPage(driver);
            productPage.clickAddToCart();
            homePage.clickCart();
        } catch (Exception e) {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("/Users/bekamakharadze/IdeaProjects/EducationPlanTests/src/test/resources/error.png"));
            LOGGER.info("Error, check the image at: /Users/bekamakharadze/IdeaProjects/EducationPlanTests/src/test/resources/error.png");
        }
    }
}
