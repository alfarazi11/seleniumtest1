package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {

//    public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
//    public static ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();

    public static WebDriver driver;
    public static  WebDriverWait explicitWait;

    public static String urlLoginStg = "https://iam.meditap.xyz/auth/realms/provider/protocol/openid-connect/auth?client_id=dire-web-provider&redirect_uri=https%3A%2F%2Fprovider-staging.meditap.id%2F&state=69afbe58-6806-4c45-bcc1-22be44423d29&response_mode=fragment&response_type=code&scope=openid&nonce=7805f0c5-5d03-482f-af3d-2105beaaecee&12f5Vfx9iMR5yo=8381949d-87d4-4a3c-9a29-e4c3b3650b24";
    public static String urlStg = "https://provider-staging.meditap.id/?12f5Vfx9iMR5yo=8381949d-87d4-4a3c-9a29-e4c3b3650b24";

    @BeforeMethod
    public void openBrowser() throws InterruptedException {
        //open brower
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*", "--disable-notifications");


        // buka link
        driver = new ChromeDriver(options);
        //        driver.set(new ChromeDriver(options));
        driver.manage().window().maximize();
        driver.get(urlLoginStg);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        explicitWait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(60)));
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
