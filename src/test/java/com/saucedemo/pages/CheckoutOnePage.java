package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.String.format;

public class CheckoutOnePage extends BasePage{
    public CheckoutOnePage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(id = "last-name")
    private WebElement lastName;
    @FindBy(id = "postal-code")
    private WebElement postalCode;
    @FindBy(id = "continue")
    private WebElement continueButton;

    public void typeFirstName(String firstName){
        logInfo(format("Entering [%s] as the First Name...",firstName));
        typeText(this.firstName, firstName);
    }

    public void typeLastName(String lastName){
        logInfo(format("Entering [%s] as the Last Name...",lastName));
        typeText(this.lastName, lastName);
    }

    public void typePostalCode(String postalCode){
        logInfo(format("Entering [%s] as the Postal Code...",postalCode));
        typeText(this.postalCode, postalCode);
    }

    public CheckoutTwoPage goToCheckoutTwo(){
        logInfo("Redirecting to the Second Checkout page...");
        clickElement(continueButton);
        return new CheckoutTwoPage(getDriver());
    }
}
