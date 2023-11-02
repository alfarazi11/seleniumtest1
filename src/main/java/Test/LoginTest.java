package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;

public class LoginTest extends BaseTest{

    @Test(testName = "Login dengan valid credential")
    public void loginValidCredential() throws InterruptedException {
        String uName = "SiloamSurabaya";
        String pass = "Login123!";

        LoginPage loginPage = new LoginPage(driver,explicitWait);
        HomePage homePage = new HomePage(driver,explicitWait);

        Thread.sleep(3000);
        loginPage.inputUserName("SiloamSurabaya");
        loginPage.inputPass(pass);
        loginPage.inputCaptcha("5TGRVM");
        loginPage.clickBtnLogin();
        Thread.sleep(10000);
        Assert.assertTrue(homePage.verifyProviderName());

    }




}
