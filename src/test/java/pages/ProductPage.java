package pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{

    public By cakeSize=By.xpath("//select[@id='product_detail_id']");
    public By enterLabel=By.xpath("//input[@id='product_label']");
    public By cakeQuantityIncrement=By.xpath("//button[normalize-space()='+']");
    public By cakeQuantityDecrement=By.xpath("//button[normalize-space()='-']");

    public By clickCart=By.xpath("//button[normalize-space()='Add to cart']");


    public  void clickOnSize()
    {
        clickOnElement(cakeSize);
    }

    public  void selectCakeSize()
    {
        selectField(cakeSize,1);
    }

    public  void enterLabelText()
    {
        sendKeys(enterLabel,"Happy Birthday");
    }
    public  void quantityIncrement()
    {
        clickOnElement(cakeQuantityIncrement);
    }

    public  void clickOnAddToCart()
    {
        clickOnElement(clickCart);
    }

}
