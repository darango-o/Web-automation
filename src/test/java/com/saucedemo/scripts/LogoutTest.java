package com.saucedemo.scripts;

import org.testng.annotations.Test;

public class LogoutTest extends BaseTest{
    @Test
    public void logoutTest(){
        inventoryPage.openSidebarMenu();
        inventoryPage.logout();
    }

    @Override
    public void logout(){
    }
}
