package com.gmail.romkrasko.pages;

import com.gmail.romkrasko.core.WaiterClass;
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
    WaiterClass waiter = new WaiterClass();

    @FindBy(css = "div.mail-User-Name")
    public WebElement userName;

    @FindBy(css = "#nb-4 > div > div > div:nth-child(8) > a")
    public WebElement logOutButton;

    public void clickLogOut(){
        waiter.WaitUntilElementIsEnable(userName);
        userName.click();
        logOutButton.click();
    }





}