package pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage{
    public By fullName=By.xpath("//input[@id='name']");
    public By emailField=By.xpath("//form[@class='woocommerce-form woocommerce-form-register register']//input[@id='email']");
    public By passwordField=By.xpath("//form[@class='woocommerce-form woocommerce-form-register register']//input[@id='password']");
    public By confirmPasswordField=By.xpath("//input[@id='password-confirm']");
    public By registerButton=By.xpath("//button[normalize-space()='Register']");



}
