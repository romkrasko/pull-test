package com.gmail.romkrasko.tests;

import com.gmail.romkrasko.pages.MainPage;
import com.gmail.romkrasko.pages.MailMainPage;
import com.gmail.romkrasko.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.gmail.romkrasko.core.BrowserFactory.*;

public class InvalidLogin extends BaseTest {
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
    public void invalidLogin(){
        mainPage.clickMailButton();
        loginPage.setLogin("NoAutotestUser");
        loginPage.setPassword("AutotestUser123");
        loginPage.clickLoginButton();
        String expectedLogin = loginPage.checkingInvalidMessage();
        Assert.assertEquals(expectedLogin,"Такого аккаунта нет");
    }
}
