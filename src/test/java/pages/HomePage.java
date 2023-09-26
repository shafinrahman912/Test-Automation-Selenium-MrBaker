package pages;

import jdk.jfr.Timespan;
import org.openqa.selenium.By;

import java.time.Duration;

public class HomePage extends BasePage{


    public String siteURL="https://www.mrbakerbd.com/";
    public By searchFoodItems=By.xpath("//div[@class='searchform-popup']//input[@placeholder='Search…']");
    public By searchButton=By.xpath("//div[@class='searchform-popup']//button[@title='Search']");
    public By clickCakeCategory=By.xpath("//li[@class='porto-links-item']//a[normalize-space()='Cake']");
    public By clickCake=By.xpath("//h3[normalize-space()='CHOCOLATE DAKER CAKE']");

    private String cakeName;

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }


    public By selectFoodItem=By.xpath("//h3[normalize-space()='RED VELVET CAKE']");


    public  void clickOnCategory()
    {
        clickOnElement(clickCakeCategory);
    }
    public  void clickOnCake()
    {
        clickOnElement(clickCake);

    }
    public  void searchFood()
    {
        sendKeys(searchFoodItems,"RED VELVET CAKE");

    }
    public  void clickOnSearchButton()
    {
        clickOnElement(searchButton);
    }


    public  void clickOnFoodItem()
    {
        clickOnElement(selectFoodItem);

    }



}
