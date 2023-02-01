package com.solvd.amazon.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DriverService.class);
    private static final String localhost = Configuration.getProperty("selenium_url");

    public static void setUp() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName(Configuration.getProperty("browser"));
        try {
            WebDriverPool.add(new RemoteWebDriver(new URL(localhost), desiredCapabilities));
        } catch (MalformedURLException e) {
            LOGGER.error("Error message: " + e.getMessage());
        }
    }

    public static void shutDown() {
        WebDriver driver = WebDriverPool.get();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.close();
        driver.quit();
    }

}