package com.solvd.amazon.page.first;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AmazonHomePage {
    private static final Logger LOGGER = LogManager.getLogger(AmazonHomePage.class);

    protected WebDriver driver;

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void pause(int num) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(num));
        driver.quit();
    }

    //TEST 2
    By searchInput = By.xpath("//input[@aria-label='Search']");

    By searchButton = By.xpath("//input[@type='submit']");

    By priceButton = By.xpath("//*[@id=\"p_36/2421887011\"]/span/a");

    By searchResult = By.xpath("//*[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a/span");

    public void printResultItemTexts() {
        driver.findElements(searchResult)
                .forEach(e -> LOGGER.info(e.getText()));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void searchBarType(String s) {
        driver.findElement(searchInput).sendKeys(s);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }

    public void clickPrice() {
        driver.findElement(priceButton).click();
    }

    public void getSearchResult() {
        driver.findElements(searchResult);
    }

}
