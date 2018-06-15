package com.gmail.romkrasko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TranslatorPage {
    public TranslatorPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    public String getTranslatorPageUrl(){
        String translatorPageUrl = driver.getCurrentUrl();
        return translatorPageUrl;
    }
}
