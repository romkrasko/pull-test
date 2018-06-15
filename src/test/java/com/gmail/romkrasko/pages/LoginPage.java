package com.gmail.romkrasko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(name = "login")
    public WebElement loginInput;

    @FindBy(name = "passwd")
    public WebElement passwordInput;

    @FindBy(className = "passport-Button-Content")
    public WebElement loginButton;

    @FindBy(css = ".passport-Domik-Form-Error_active")
    public WebElement invalidMessageText;

    @FindBy(css = "div.mail-User-Name")
    public WebElement userName;

    public void setLogin(String login){
        loginInput.sendKeys(login);
    }

    public void setPassword(String password){
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public String checkingInvalidMessage(){
        String invalidMessage = invalidMessageText.getText();
        return invalidMessage;

    }

    public String getUserName(){
        String nameUser = userName.getText();
        return nameUser;
    }






}
