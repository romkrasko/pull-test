package com.gmail.romkrasko.tests;

import com.gmail.romkrasko.pages.LanguageSettingsPage;
import com.gmail.romkrasko.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.gmail.romkrasko.core.BrowserFactory.*;

public class LanguageChangingTest extends BaseTest {
    public static MainPage mainPage;
    public static LanguageSettingsPage languageSettingsPage;

    @BeforeClass
    protected void initiliaze() {
        mainPage = new MainPage(driver);
        languageSettingsPage = new LanguageSettingsPage(driver);
    }

    @Test
    public void languageChanging(){
        mainPage.clickChangeLanguageButton();
        languageSettingsPage.selectEnglishLanguage();
        languageSettingsPage.clickSaveButton();
        String actualLanguage = mainPage.getEnglishLanguageLabel();
        Assert.assertEquals(actualLanguage, "Eng");
    }



}
