package com.gmail.romkrasko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewsPage {
    public NewsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    public String getNewsPageUrl(){
        String newsPageUrl = driver.getCurrentUrl();
        return newsPageUrl;
    }
}
