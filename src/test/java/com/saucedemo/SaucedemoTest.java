package com.saucedemo;

import org.testng.annotations.*;

public class SaucedemoTest {

    @BeforeClass
    public void setupBrowser(){
        System.out.println("- Se abre el navegador.\n- Se dirige hacia la siguiente URL: saucedemo.com.\n");
    }

    @BeforeMethod
    public void loginUser(){
        System.out.println("- Se introduce un Username parametrizado.\n- Se introduce una Password parametrizada.\n- Se presiona el botón de Login.\n");
    }

    @Test
    public void purchaseProduct(){
        System.out.println("- Presionar Add to cart en cualquier producto.\n- Presionar el símbolo de carrito de compras.\n- Presionar Checkout.\n- Ingresar First Name, Last Name y Zip.\n- Presionar Continue.\n- Presionar Finish.\n- Verificar que se esté en la página de compra exitosa.\n");
    }

    @Test
    public void removingElements(){
        System.out.println("- presionar Add to cart en cualquier producto (y repetir el mismo proceso con otros dos productos)\n- Presionar el ícono del carrito de compras.\n- Verificar que hayan tres objetos en la lista.\n- Presionar Remove en cada objeto.\n- Verificar que ya no hayan objetos.\n");
    }

    @Test
    public void logout(){
        System.out.println("- Presionar la hamburguesa\n- presionar el botón de logout.\n- Verificar que se está en la página de login.\n");
    }

    @AfterMethod
    public void resetAppState(){
        System.out.println("- Presionar la hamburguesa\n- Presionar el botón de Reset App State.\n- Presionar el botón de Logout.\n");
    }

    @AfterClass
    public void closeBrowser(){
        System.out.println("- Cerrar navegador.\n");
    }

}
