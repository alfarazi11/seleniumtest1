package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.BasePage;

import java.time.Duration;

public class TestSelenium extends BaseTest {




        @Test
        public void testLogin(){

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
            driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SiloamSurabaya");
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Login123!");
            driver.findElement(By.xpath("//input[@id='captcha-input']")).sendKeys("5TGRVM");
            driver.findElement(By.xpath("//input[@id='kc-login']")).click();
//            Thread.sleep(5000);

            // verify berhasil login
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'siloamsurabaya')]")));
            String txtExpected =  driver.findElement(By.xpath("//p[contains(text(),'siloamsurabaya')]")).getText();
            String txtActual = "siloamsurabaya";
            Assert.assertEquals(txtActual,txtExpected);
        }

        @Test
        public void testLogin2(){

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
            driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SiloamSurabaya");
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Login123!");
            driver.findElement(By.xpath("//input[@id='captcha-input']")).sendKeys("5TGRVM");
            driver.findElement(By.xpath("//input[@id='kc-login']")).click();
//            Thread.sleep(5000);

        // verify berhasil login
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'siloamsurabaya')]")));
        String txtExpected =  driver.findElement(By.xpath("//p[contains(text(),'siloamsurabaya')]")).getText();
        String txtActual = "siloamsurabaya";
        Assert.assertNotEquals(txtActual,txtExpected);
    }

}
