package com.saucedemo.testData;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name="customerInfo")
    public static Object[][] testDataCustomerInfo() {
        return new Object[][] {
                {
                        "Daniel",
                        "Arango",
                        "1234"
                }
        };
    }
}
