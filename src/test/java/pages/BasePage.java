package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverSetup;

import java.time.Duration;

public class BasePage extends DriverSetup {

    public WebElement getElement(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void clickOnElement(By locator) {
        getElement(locator).click();

    }

    public String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public void sendKeys(By locator, String text) {
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

    public void selectField(By locator, String text) {
        Select select = new Select(getElement(locator));
        select.selectByVisibleText(text);

    }

    public void selectField(By locator, int index) {
        Select select = new Select(getElement(locator));
        select.selectByIndex(index);

    }

    public void hoverA(By locator) {
        WebElement element = getElement(locator);
        Actions actions = new Actions(getDriver());
        actions.clickAndHold(element).build().perform();
    }

}
