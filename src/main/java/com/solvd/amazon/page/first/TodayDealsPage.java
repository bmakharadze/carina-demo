package com.solvd.amazon.page.first;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//testing
public class TodayDealsPage {
    private static final Logger LOGGER = LogManager.getLogger(TodayDealsPage.class);

    protected WebDriver driver;

    public void open() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://amazon.com/");
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input")));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        LOGGER.info(firstResult.getText());
    }

    public void pause(int num) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(num));
        driver.quit();
    }

    public TodayDealsPage(WebDriver driver) {
        this.driver = driver;
    }

    By changeLanguage = By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input");

    By todayDealsButton = By.xpath("//div[@id='nav-xshop-container']/div/a[1]");

    By booksButton = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[7]/label/input");

    //Open from incognito and type book xpath
    By book = By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[3]/div/div/div/a[2]");

    By addToCartButton = By.xpath("//div[@class='a-button-stack']/span/span/span/input");

    By cartButton = By.xpath("//div[@class='nav-right']/div/a[4]");

    //will delete all items.
    By deleteItemButton = By.xpath("//div[@class='a-row sc-action-links']/span[2]/span/input");

    public void clickChangeLanguage() {
        driver.findElement(changeLanguage).click();
    }


    public void clickTodayDeals() {
        driver.findElement(todayDealsButton).click();
    }

    public void clickBooksButton() {
        driver.findElement(booksButton).click();
    }

    public void clickBook() {
        driver.findElement(book).click();
    }

    public void clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }

    public void clickCartButton() {
        driver.findElement(cartButton).click();
    }

    public void clickDeleteItemButton() {
        driver.findElement(deleteItemButton).click();
    }
}
