package com.saucedemo.scripts;

import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import com.sun.source.util.DocTreePath;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import javax.lang.model.element.Element;
import javax.tools.Diagnostic;

import com.saucedemo.Reporter;

import static java.lang.String.format;

public class BaseTest extends Reporter {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected InventoryPage inventoryPage;

    @BeforeSuite
    public void driverSetup(){
        logInfo("### Web driver manager setup ###");
        WebDriverManager.chromedriver().setup();
    }

    @Parameters("url")
    @BeforeClass
    public void browserSetup(String url){
        logInfo("Starting new Chrome driver session...");
        driver = new ChromeDriver();
        logInfo(format("Navigating to %s", url));
        driver.get(url);
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

    @Parameters({"username", "password"})
    @BeforeMethod
    public void loginPage(String username, String password){
        loginPage.typeUsername(username);
        loginPage.typeUserPassword(password);
        loginPage.clickLoginButton();
        inventoryPage = new InventoryPage(driver);
    }

    @AfterMethod
    public void logout(){
        inventoryPage.openSidebarMenu();
        inventoryPage.resetAppState();
        inventoryPage.logout();
    }

    @AfterClass
    public void teardown(){
        logInfo("Closing Chrome driver session...");
        driver.quit();
    }
}
