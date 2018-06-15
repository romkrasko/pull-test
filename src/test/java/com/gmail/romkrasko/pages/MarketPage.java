package com.gmail.romkrasko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MarketPage {
    public MarketPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    public String getMarketPageTitle(){
        String marketPageTitle = driver.getTitle();
        return marketPageTitle;

    }
}
