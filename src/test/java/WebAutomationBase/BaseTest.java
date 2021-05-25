package WebAutomationBase;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;


    @BeforeScenario
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--kiosk");
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver,20);
        driver.get("https://www.incehesap.com/");


    }
    @AfterScenario
    public void tearDown(){
        driver.quit();
    }
}
