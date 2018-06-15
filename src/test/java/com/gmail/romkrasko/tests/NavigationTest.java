package com.gmail.romkrasko.tests;

import com.gmail.romkrasko.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.gmail.romkrasko.core.BrowserFactory.*;

public class NavigationTest extends BaseTest {
    private static MainPage mainPage;
    private static VideoPage videoPage;
    private static PicturesPage picturesPage;
    private static NewsPage newsPage;
    private static MapsPage mapsPage;
    private static MarketPage marketPage;
    private static TranslatorPage translatorPage;
    private static MusicPage musicPage;

    @BeforeClass
    protected void initiliaze() {
        mainPage = new MainPage(driver);
        videoPage = new VideoPage(driver);
        picturesPage = new PicturesPage(driver);
        newsPage = new NewsPage(driver);
        mapsPage = new MapsPage(driver);
        marketPage = new MarketPage(driver);
        translatorPage = new TranslatorPage(driver);
        musicPage = new MusicPage(driver);
    }

    @Test
    public void navigationTest(){
        mainPage.clickVideoButton();
        String actualVideoPageUrl = videoPage.getVideoPageUrl();
        Assert.assertEquals(actualVideoPageUrl, "https://yandex.by/video/");
        driver.get("https://www.yandex.by/");
        mainPage.clickPicturesButton();
        String actualPicturesPageUrl = picturesPage.getPicturesPageUrl();
        Assert.assertEquals(actualPicturesPageUrl, "https://yandex.by/images/");
        driver.get("https://www.yandex.by/");
        mainPage.clickNewsButton();
        String actualNewsPageUrl = newsPage.getNewsPageUrl();
        Assert.assertEquals(actualNewsPageUrl, "https://news.yandex.by/");
        driver.get("https://www.yandex.by/");
        mainPage.clickMapsButton();
        String actualMapsPageTitle = mapsPage.getMapsPageTitle();
        Assert.assertEquals(actualMapsPageTitle, "Яндекс.Карты — подробная карта Беларуси и мира");
        driver.get("https://www.yandex.by/");
        mainPage.clickMarketButton();
        String actualMarketPageTitle = marketPage.getMarketPageTitle();
        Assert.assertEquals(actualMarketPageTitle, "Яндекс.Маркет — выбор и покупка товаров из проверенных интернет-магазинов");
        driver.get("https://www.yandex.by/");
        mainPage.clickTranslatorButton();
        String actualTranslatorPageUrl = translatorPage.getTranslatorPageUrl();
        Assert.assertEquals(actualTranslatorPageUrl, "https://translate.yandex.by/");
        driver.get("https://www.yandex.by/");
        mainPage.clickMusicButton();
        String actualMusicPageUrl = musicPage.getMusicPageUrl();
        Assert.assertEquals(actualMusicPageUrl, "https://music.yandex.by/home");
    }
}
