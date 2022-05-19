package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement zipCodeField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;

    public void enterFirstName(String firstname){
        sendTextToElement(firstNameField,firstname);
    }
    public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName);
    }
    public void enterZipCode(String zipCode){
        sendTextToElement(zipCodeField,zipCode);
    }
    public void enterUserDetails(String firstName, String lastName, String zipcode){
        enterFirstName(firstName);
        enterLastName(lastName);
        enterZipCode(zipcode);
        log.info("Enter first name "+firstName+ " last name "+lastName+" zip code "+zipcode+firstName.toString());
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
        log.info("Clicking On Continue button "+continueButton.toString());
    }
    
}
