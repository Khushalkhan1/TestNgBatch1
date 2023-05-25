package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public WebDriver driver;
    @Test
    public void openBrowserAndLaunch(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://dreamhiringacademy.com/user/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
    }
}
