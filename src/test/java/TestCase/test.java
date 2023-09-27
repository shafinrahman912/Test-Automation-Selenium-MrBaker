package TestCase;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import pages.RegisterPage;
import utilities.DriverSetup;

@Test
public class test extends DriverSetup {
    @Test
    public  void HomeCategoryTest() throws InterruptedException {

        HomePage homePage = new HomePage();
        getDriver().get(homePage.siteURL);
        homePage.clickOnCategory();
        homePage.clickOnCake();
        Thread.sleep(4000);

        ProductPage productPage = new ProductPage();
        productPage.clickOnSize();
        productPage.selectCakeSize();
        productPage.enterLabelText();
        productPage.quantityIncrement();
        productPage.clickOnAddToCart();
        Thread.sleep(5000);
    }
        @Test
        public  void SearchTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        getDriver().navigate().to(homePage.siteURL);
        homePage.searchFood();
        Thread.sleep(2000);
        homePage.clickOnSearchButton();
        Thread.sleep(3000);
//       homePage.setCakeName("RED VELVET CAKE");

        homePage.clickOnFoodItem();
        ProductPage productPage=new ProductPage();
        productPage.clickOnSize();
        productPage.selectCakeSize();
        productPage.enterLabelText();
        productPage.clickOnAddToCart();

    }
    @Test
    public void RegistrationTest () throws InterruptedException {
        HomePage homePage=new HomePage();
        getDriver().get(homePage.siteURL);
        Thread.sleep(2000);
        homePage.clickOnElement(homePage.register);
        Thread.sleep(2000);
        RegisterPage registrationPage= new RegisterPage();
        registrationPage.sendKeys(registrationPage.fullName,"abcd");
        registrationPage.sendKeys(registrationPage.emailField,"abcd");
        registrationPage.sendKeys(registrationPage.passwordField,"abcd");
        registrationPage.sendKeys(registrationPage.confirmPasswordField,"abcd");
        registrationPage.clickOnElement(registrationPage.registerButton);

        Thread.sleep(5000);

    }
}
