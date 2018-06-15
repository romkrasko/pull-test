package com.gmail.romkrasko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MusicPage {
    public MusicPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;
    public String getMusicPageUrl(){
        String musicPageUrl = driver.getCurrentUrl();
        return musicPageUrl;
    }
}
