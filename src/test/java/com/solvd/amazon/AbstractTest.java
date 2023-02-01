package com.solvd.amazon;

import com.solvd.amazon.service.DriverService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class AbstractTest {
    private static final Logger LOGGER = LogManager.getLogger(AbstractTest.class);
    @BeforeMethod
    public void setup() {
        DriverService.setUp();
        LOGGER.info("setup");
    }

    @AfterMethod
    public void end() {
        DriverService.shutDown();
        LOGGER.info("done");
    }

}
