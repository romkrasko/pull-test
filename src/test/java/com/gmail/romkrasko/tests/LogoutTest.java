package com.gmail.romkrasko.tests;

import com.gmail.romkrasko.pages.MainPage;
import com.gmail.romkrasko.pages.LoginPage;
import com.gmail.romkrasko.pages.MailMainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.gmail.romkrasko.core.BrowserFactory.*;

public class LogoutTest extends BaseTest {
    public static MainPage mainPage;
    public static LoginPage loginPage;
    public static MailMainPage mailMainPage;

    @BeforeClass
    protected void initiliaze() {
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        mailMainPage = new MailMainPage(driver);
    }

    @Test
    public void logout(){
        mainPage.clickMailButton();
        loginPage.setLogin("AutotestUser");
        loginPage.setPassword("AutotestUser123");
        loginPage.clickLoginButton();
        mailMainPage.clickLogOut();
        String actualMainPageUrl = mainPage.getMainPageUrl();
        Assert.assertEquals(actualMainPageUrl,"https://yandex.by/");
    }
}
