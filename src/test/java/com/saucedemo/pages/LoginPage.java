package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.String.format;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id="user-name")
    private WebElement username;
    @FindBy(id="password")
    private WebElement password;
    @FindBy(id="login-button")
    private WebElement loginButton;

    public void typeUsername(String username){
        logInfo(format("Logging in with [%s] as the Username", username));
        typeText(this.username, username);
    }
    public void typeUserPassword(String password){
        logInfo(format("Logging in with [%s] as the Password", password));
        typeText(this.password, password);
    }
    public void clickLoginButton(){
        logInfo("Redirecting to the Inventory page...");
        clickElement(loginButton);
    }
}
