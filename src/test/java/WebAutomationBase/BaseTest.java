package WebAutomationBase;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BaseTest {
    protected static WebDriver driver;
    protected static WebDriverWait wait;


    @BeforeScenario
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.incehesap.com/");
        wait = new WebDriverWait(driver,20,75);
    }
    @AfterScenario
    public void tearDown(){
        driver.quit();
    }
}
