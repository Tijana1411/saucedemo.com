package tests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.*;

public class PalankaTest extends BaseTest {
    LogInPage logInPage;
    ProductsPage productsPage;
    CartPage cartPage;
    CheckOutPage checkOutPage;
    OrderPage orderPage;
    PonyExpressPage ponyExpressPage;


    @Before

    public void setUpTest() {
        logInPage = new LogInPage();
        productsPage = new ProductsPage();
        cartPage = new CartPage();
        checkOutPage = new CheckOutPage();
        orderPage = new OrderPage();
        ponyExpressPage = new PonyExpressPage();

    }

    @Test

    public void setLogInPageTest() {
        logInPage.fillUserName("performance_glitch_user")
                .fillPassword("secret_sauce")
                .clickOnButton();
        productsPage.clickOnAddButton();

        Assert.assertTrue(productsPage.badgeIsDisplayed());
        Assert.assertEquals("1", productsPage.textBadge());

    }

    @Test

    public void secondPruductInTheCartTest() {
        setLogInPageTest();
//        logInPage.fillUserName("performance_glitch_user")
//                .fillPassword("secret_sauce")
//                .clickOnButton();
//        pruductsPage.clickOnAddButton()
                productsPage.productTwoDisplay()
                .addProductTwoInTheCart()
                .clickOnCart();

        Assert.assertEquals(String.valueOf(true), cartPage.product1IsDisplayed(), cartPage.product2IsDisplayed());
        // Assert.assertEquals(true, cartPage.product2IsDisplayed());
        Assert.assertEquals("2", productsPage.textBadge());

    }

    @Test

    public void remove1ItemTest() {
        secondPruductInTheCartTest();
//        logInPage.fillUserName("performance_glitch_user")
//                .fillPassword("secret_sauce")
//                .clickOnButton();
//        productsPage.clickOnAddButton()
//                .productTwoDisplay()
//                .addProductTwoInTheCart()
//                .clickOnCart();
        cartPage.remove();


        Assert.assertEquals("1", cartPage.stringBadge());
        Assert.assertTrue(cartPage.product2IsDisplayed());

    }

    @Test

    public void checkoutTest(){
        remove1ItemTest();
//        logInPage.fillUserName("performance_glitch_user")
//                .fillPassword("secret_sauce")
//                .clickOnButton();
//        productsPage.clickOnAddButton()
//                .productTwoDisplay()
//                .addProductTwoInTheCart()
//                .clickOnCart();
//        cartPage.remove()
                cartPage.clickOnCheckout();
        checkOutPage.fillFirstName("Webster")
                .fillLastName("Websterkovic")
                .fillZipCode("123456")
                .clickOnContinue();
        orderPage.clickOnFinishButton();


        Assert.assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!",ponyExpressPage.orderSuccessText());


    }
}


