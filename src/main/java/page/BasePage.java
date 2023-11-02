package page;

import bsh.This;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

//    public ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
//    public ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();

    WebDriver driver;
    WebDriverWait explicitWait;

    public BasePage(WebDriver driver, WebDriverWait explicitWait) {
        this.driver = driver;
        this.explicitWait = explicitWait;
    }

    public void doClick(WebElement element){
//        waitForClickable(element);
        element.click();
    }

    public void doSetText(WebElement element, String text){
//        waitForVisibility(element);
        element.sendKeys(text);
    }

    protected final String doGetText(WebElement element){
//        waitForVisibility(element);
        String actualText = element.getText();
        return actualText;
    }

    public void waitForClickable(WebElement element){
        explicitWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForVisibility(WebElement element){
        explicitWait.until(ExpectedConditions.visibilityOf(element));
    }
}
