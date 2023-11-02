package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    @FindBy (xpath = "//p[contains(text(),'siloamsurabaya')]")
    WebElement txtNamaProvider;



    public HomePage(WebDriver driver, WebDriverWait explicitWait) {
        super(driver, explicitWait);
    }


    public Boolean verifyProviderName(){
        if(doGetText(txtNamaProvider).contains("siloamsurabaya")){
            return true;
        }
        return false;
    }
}
