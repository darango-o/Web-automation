package com.saucedemo.scripts;

import com.saucedemo.pages.CartPage;
import org.testng.annotations.Test;

public class RemovingCartItemsTest extends BaseTest{
    @Test
    public void removeItemsTest(){
        inventoryPage.addThreeRandomItemsToCart();

        CartPage cartPage = inventoryPage.goToCartPage();


        cartPage.removeAllItems();

        cartPage.goBack();
    }
}
