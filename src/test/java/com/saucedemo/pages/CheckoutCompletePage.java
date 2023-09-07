package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage{
    public CheckoutCompletePage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "back-to-products")
    private WebElement backHomeButton;

    public void goToInventory(){
        logInfo("Purchase Complete! Redirecting to the Inventory page...");
        clickElement(backHomeButton);
    }
}
