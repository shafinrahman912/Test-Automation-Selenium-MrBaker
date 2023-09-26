package utilities;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;

public class test extends DriverSetup{
    @Test
    public  void test1() throws InterruptedException{

        HomePage homePage=new HomePage();
        getDriver().get(homePage.siteURL);
        Thread.sleep(2000);
        homePage.clickOnCategory();
        Thread.sleep(2000);
        homePage.clickOnCake();
        Thread.sleep(2000);

        ProductPage productPage=new ProductPage();
        productPage.clickOnSize();
        Thread.sleep(2000);
        productPage.selectCakeSize();
        Thread.sleep(2000);
        productPage.enterLabelText();
        Thread.sleep(2000);
        productPage.quantityIncrement();
        Thread.sleep(2000);
        productPage.clickOnAddToCart();
        Thread.sleep(2000);
        getDriver().navigate().to(homePage.siteURL);
        homePage.searchFood();
        Thread.sleep(2000);
        homePage.clickOnSearchButton();
        Thread.sleep(2000);
//        homePage.setCakeName("RED VELVET CAKE");
        homePage.clickOnFoodItem();

        productPage.clickOnSize();

        productPage.selectCakeSize();

        productPage.enterLabelText();

        productPage.clickOnAddToCart();





    }
}
