package com.saucedemo.scripts;

import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckoutCompletePage;
import com.saucedemo.pages.CheckoutOnePage;
import com.saucedemo.pages.CheckoutTwoPage;
import com.saucedemo.testData.TestDataProvider;
import org.testng.annotations.Test;

public class PurchaseItemTest extends BaseTest {
    private String INVENTORY_PAGE_TITLE = "Products";
    private String CART_PAGE_TITLE = "Your Cart";
    private String CHECKOUT_STEP_ONE_PAGE_TITLE = "Checkout: Your Information";
    private String CHECKOUT_STEP_TWO_PAGE_TITLE = "Checkout: Overview";
    private String CHECKOUT_COMPLETE_PAGE_TITLE = "Checkout: Complete!";

    @Test(dataProvider = "customerInfo", dataProviderClass = TestDataProvider.class)
    public void purchaseTest(String firstName, String lastName, String postalCode){
        inventoryPage.addRandomItemToCart();

        CartPage cartPage = inventoryPage.goToCartPage();

        CheckoutOnePage checkoutOnePage = cartPage.goToCheckout();

        checkoutOnePage.typeFirstName(firstName);

        checkoutOnePage.typeLastName(lastName);

        checkoutOnePage.typePostalCode(postalCode);

        CheckoutTwoPage checkoutTwoPage = checkoutOnePage.goToCheckoutTwo();

        CheckoutCompletePage checkoutCompletePage = checkoutTwoPage.goToCheckoutComplete();

        checkoutCompletePage.goToInventory();

    }
}
