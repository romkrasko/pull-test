package com.gmail.romkrasko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LanguageSettingsPage {
    public LanguageSettingsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(css = ".i-bem.select_js_inited button")
    public WebElement languageButton;

    @FindBy(css = ".select__popup.select__popup_size_m.select__popup_theme_normal.i-bem.popup_js_inited.popup_to_bottom.popup_visibility_visible div:nth-child(6)")
    public WebElement englishButton;

    @FindBy(css = "div:nth-child(4)  div  button")
    public WebElement saveButton;

    public void selectEnglishLanguage(){
        languageButton.click();
        englishButton.click();

    }

    public void clickSaveButton(){
        saveButton.click();
    }




}
