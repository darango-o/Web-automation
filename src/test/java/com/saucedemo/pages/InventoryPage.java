package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class InventoryPage extends BasePage{
    public InventoryPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".shopping_cart_link")
    private WebElement shoppingCartLink;

    @FindBy(css = "button[class$=btn_inventory]")
    private List<WebElement> addToCartButtons;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement sidebarButton;
    @FindBy(css = "a[id$=sidebar_link]")
    private List<WebElement> sidebarElements;

    Random random = new Random();

    public void addRandomItemToCart(){
        logInfo("Adding a random item to the cart...");
        int i = random.nextInt(addToCartButtons.size()-1);
        clickElement(addToCartButtons.get(i));
        logInfo("Random item added!");
    }

    public void addThreeRandomItemsToCart(){
        logInfo("Adding three random items to the cart...");
        Set<Integer> indexes = new HashSet<>();
        while(indexes.size() < 3){
            int i = random.nextInt(addToCartButtons.size()-1);
            indexes.add(i);
        }
        for(int index : indexes){
            clickElement(addToCartButtons.get(index));
        }
        logInfo("Three random items Added!");
    }

    public CartPage goToCartPage(){
        logInfo("Redirecting to the Shopping Cart page...");
        clickElement(shoppingCartLink);
        return new CartPage(getDriver());
    }

    public void openSidebarMenu(){
        logInfo("Opening Sidebar Menu...");
        clickElement(sidebarButton);
        logInfo("Sidebar Menu Opened!");
    }

    public void resetAppState(){
        logInfo("Resetting the App State...");
        clickElement(sidebarElements.get(3));
        logInfo("App State reset!");
    }

    public void logout(){
        logInfo("Logging out...");
        clickElement(sidebarElements.get(2));
        logInfo("Logged out!");
    }
}
