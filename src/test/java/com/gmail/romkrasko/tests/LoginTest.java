package com.gmail.romkrasko.tests;

import com.gmail.romkrasko.pages.LoginPage;
import com.gmail.romkrasko.pages.MailMainPage;
import com.gmail.romkrasko.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.gmail.romkrasko.core.BrowserFactory.*;

public class LoginTest extends BaseTest {

    public static MainPage mainPage;
    public static LoginPage loginPage;
    public static MailMainPage mailMainPage;

    @BeforeClass
    public void initiliaze() {
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        mailMainPage = new MailMainPage(driver);
        mailMainPage = new MailMainPage(driver);
    }

    @Test
    public void logining() {
        mainPage.clickMailButton();
        loginPage.setLogin("AutotestUser");
        loginPage.setPassword("AutotestUser123");
        loginPage.clickLoginButton();
        String expectedResult = loginPage.getUserName();
        Assert.assertEquals(expectedResult, "AutotestUser");

    }
}
