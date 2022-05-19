package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userNameBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;

    public void enterUserName(String username){
        sendTextToElement(userNameBox,username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordBox,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        log.info("Clicking On LoginButton button "+loginButton.toString());
    }
    public void enterUserNameAndPassword(String userName, String password){
        enterUserName(userName);
        enterPassword(password);
        log.info("Enter user name "+userName+" and password "+password+" "+userName.toString()+" "+password.toString());
    }
}
