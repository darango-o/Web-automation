package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "button[id^=remove]")
    private List<WebElement> removeButtons;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;
    @FindBy(id = "continue-shopping")
    private WebElement goBackButton;

    public void removeAllItems(){
        logInfo("Removing all items from the Cart...");
        for(int i = removeButtons.size()-1;i>=0; i--){
            clickElement(removeButtons.get(i));
        }
        logInfo("All items removed!");
    }

    public int itemsInCart(){
        return removeButtons.size();
    }

    public CheckoutOnePage goToCheckout(){
        logInfo("Redirecting to the First Checkout page...");
        clickElement(checkoutButton);
        return new CheckoutOnePage(getDriver());
    }

    public void goBack(){
        logInfo("Redirecting to the Inventory page...");
        clickElement(goBackButton);
    }


}
