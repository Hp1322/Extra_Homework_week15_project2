package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends Utility {

    private static final Logger log = LogManager.getLogger(InventoryPage.class.getName());

    public InventoryPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']")//Price (low to high)
    WebElement highToLowMenu;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement cheapestProduct;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement costliestProduct;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    WebElement shoppingCart;

    public void selectHighToLow(String highToLow){
        selectByVisibleTextFromDropDown(highToLowMenu,highToLow);
        log.info("Selecting high to low price "+highToLowMenu.toString());
    }

    public void clickOnCheapestProduct(){
        mouseHoverToElementAndClick(cheapestProduct);
        log.info("Clicking On Cheapest Product "+cheapestProduct.toString());
    }
    public void clickOnCostliestProduct(){
        mouseHoverToElementAndClick(costliestProduct);
        log.info("Clicking On Costliest Product "+costliestProduct.toString());
    }
    public void clickOnShoppingCart(){
        mouseHoverToElementAndClick(shoppingCart);
        log.info("Clicking On Shipping cart "+shoppingCart.toString());
    }

    }

