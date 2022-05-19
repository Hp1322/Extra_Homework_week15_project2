package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutComplete extends Utility {

    private static final Logger log = LogManager.getLogger(CheckOutComplete.class.getName());

    public CheckOutComplete() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout_complete_container']")
    WebElement thankYouText;

    public String getThankYouText(){
        log.info("Getting thank you text "+thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

}
