package Base;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    public static String url = "https://automationexercise.com/";
    private static BaseTest BaseTest;


    private BaseTest(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
        driver.manage().window().maximize();
    }

    public static void setUpDriver() {
        {
            BaseTest = new BaseTest();
        }
    }
   public static WebDriver getDriver(){
        return driver;
   }

    public static void tearDown(){
        driver.quit();
    }

}
