package com.gmail.romkrasko.tests;

import com.gmail.romkrasko.pages.LoginPage;
import com.gmail.romkrasko.pages.MailMainPage;
import com.gmail.romkrasko.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import static com.gmail.romkrasko.core.BrowserFactory.*;

public class LoginTest extends BaseTest {

    public static MainPage mainPage;
    public static LoginPage loginPage;
    public static MailMainPage mailMainPage;

    public ExtentReports extent;
    public ExtentTest test;

    @BeforeClass
    public void initiliaze() {
        extent = new ExtentReports("C:/lol.html",true);
        test = extent.startTest("Valid Login Test");
        test.log(LogStatus.INFO, "Details koro4e");
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        mailMainPage = new MailMainPage(driver);
        mailMainPage = new MailMainPage(driver);
        extent.endTest(test);
        extent.flush();
    }

    @Test
    public void logining() {
        mainPage.clickMailButton();
        test.log(LogStatus.INFO, "Click button");
        loginPage.setLogin("AutotestUser");
        test.log(LogStatus.INFO, "SetLogin");
        loginPage.setPassword("AutotestUser123");
        test.log(LogStatus.INFO, "Set Password");
        loginPage.clickLoginButton();
        test.log(LogStatus.INFO, "Click Login");
        String expectedResult = loginPage.getUserName();
        Assert.assertEquals(expectedResult, "AutotestUser");
        test.log(LogStatus.INFO, "Compare results");
        extent.endTest(test);
        extent.flush();

    }
}
