package com.gmail.romkrasko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailMainPage {
    public MailMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(css = "div.mail-User-Name")
    public WebElement userName;

    @FindBy(css = "#nb-4 > div > div > div:nth-child(8) > a")
    public WebElement logOutButton;

    public void clickLogOut(){
        userName.click();
        logOutButton.click();
    }





}