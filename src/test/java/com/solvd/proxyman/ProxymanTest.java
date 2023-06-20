package com.solvd.proxyman;

import com.browserup.bup.BrowserUpProxy;
import com.browserup.bup.proxy.CaptureType;
import com.browserup.harreader.model.HarEntry;
import com.qaprosoft.carina.core.foundation.IAbstractTest;

import com.zebrunner.carina.proxy.browserup.ProxyPool;
import com.zebrunner.carina.utils.R;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ProxymanTest implements IAbstractTest {


    private static final Logger logger = LogManager.getLogger(ProxymanTest.class);

    BrowserUpProxy proxy;

    @BeforeMethod(alwaysRun = true)
    public void startProxy(){
        R.CONFIG.put("browserup_proxy","true");
        getDriver();
        proxy = ProxyPool.getProxy();
        proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT,CaptureType.RESPONSE_CONTENT);
        proxy.newHar();
    }

    @Test
    public void browserMob(){
        SolvdHomePage homePage = new SolvdHomePage(getDriver());
        homePage.open();
        List<HarEntry> entries = proxy.getHar().getLog().getEntries();
        boolean found = false;
        for (HarEntry entry : entries) {
            if (entry.getRequest().getUrl().contains("https://rest.happierleads.com")) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found URL in HAR file.");
        } else {
            System.out.println("URL not found in HAR file.");
        }
    }

    @Test
    public void proxymanTest(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        loginPage.addCookie(new Cookie("session-username", "standard_user"));
        HomePage homePage = new HomePage(getDriver());
        homePage.open();

    }

}