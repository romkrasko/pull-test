package com.gmail.romkrasko.tests;

import com.gmail.romkrasko.pages.MainPage;
import com.gmail.romkrasko.pages.MailMainPage;
import com.gmail.romkrasko.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.gmail.romkrasko.core.BrowserFactory.*;

public class InvalidPassword extends BaseTest {
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
    public void invalidPassword(){
        driver.get("https://www.yandex.by");
        mainPage.clickMailButton();
        loginPage.setLogin("AutotestUser");
        loginPage.setPassword("NoAutotestUser123");
        loginPage.clickLoginButton();
        String expectedPassword = loginPage.checkingInvalidMessage();
        Assert.assertEquals(expectedPassword, "Неверный пароль");

    }

}
