package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver, WebDriverWait explicitWait){
        super(driver,explicitWait);
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//input[@id='username']")
    WebElement colmnUserName;

    @FindBy (xpath = "//input[@id='password']")
    WebElement colmnPass;

    @FindBy (xpath = "//input[@id='captcha-input']")
    WebElement colmnCaptcha;

    @FindBy (xpath = "//input[@id='kc-login']")
    WebElement btnLogin;

    public void inputUserName(String uName){
        doSetText(colmnUserName,uName);
    }

    public void inputPass(String pass){
        doSetText(colmnPass,pass);
    }

    public void inputCaptcha(String captcha){
        doSetText(colmnCaptcha,captcha);
    }

    public void clickBtnLogin(){
        doClick(btnLogin);
    }
}
