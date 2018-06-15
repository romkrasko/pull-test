package com.gmail.romkrasko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MapsPage {
    public MapsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    public String getMapsPageTitle(){
        String mapsPageTitle = driver.getTitle();
        return mapsPageTitle;
    }
}
