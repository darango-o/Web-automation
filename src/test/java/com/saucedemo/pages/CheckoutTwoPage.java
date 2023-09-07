package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutTwoPage extends BasePage{
    public CheckoutTwoPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "finish")
    private WebElement finishButton;

    public CheckoutCompletePage goToCheckoutComplete(){
        logInfo("Redirecting to the Checkout Complete page...");
        clickElement(finishButton);
        return new CheckoutCompletePage(getDriver());
    }
}
