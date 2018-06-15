package com.gmail.romkrasko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PicturesPage {
    public PicturesPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    public String getPicturesPageUrl(){
        String picturesPageUrl = driver.getCurrentUrl();
        return picturesPageUrl;
    }
}
