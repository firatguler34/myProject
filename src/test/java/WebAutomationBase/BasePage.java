package WebAutomationBase;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BasePage extends BaseTest {

    protected WebElement findElement(By by) {
        WebElement element = null;
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            element = driver.findElement(by);
        } catch (Exception e) {
            Assert.fail("Hata, element bulunamadı" + e);
        }
        return element;
    }

    protected List<WebElement> findElements(By by) {
        List<WebElement> elements = null;
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            elements = driver.findElements(by);

        } catch (Exception e) {
            Assert.fail("Hata, element list bulunamadı" + e);
        }
        return elements;
    }

    protected void click(By by) {
        try {
            WebElement element = findElement(by);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        } catch (Exception e) {
            Assert.fail("Hata, elemente tiklanamadi" + e);
        }
    }
    protected void click(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        } catch (Exception e) {
            Assert.fail("Hata, elemente tiklanamadi" + e);
        }
    }
    protected void clickJs(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();",element);
        } catch (Exception e) {
            Assert.fail("Hata, elemente tiklanamadi" + e);
        }
    }
    protected void actionAndClickElement(WebElement element){
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            click(element);
        }catch (Exception e){
            Assert.fail("Hata, element ustune gidilemedi");
        }
    }
    protected void actionAndClickElement(By by){
        try {
            WebElement element = findElement(by);
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            click(element);
        }catch (Exception e){
            Assert.fail("Hata, element ustune gidilemedi");
        }
    }
    protected void actionAndClickElementWithJs(By by){
        try {
            WebElement element = findElement(by);
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            clickJs(element);
        }catch (Exception e){
            Assert.fail("Hata, element ustune gidilemedi");
        }
    }

    protected void sendKeys(By by, String txt) {
        try {
            WebElement element = findElement(by);
            element.sendKeys(txt);
        } catch (Exception e) {
            Assert.fail("Hata, elemente metin girilemedi" + e);
        }
    }

    protected String elementGetText(By by) {
        WebElement element = findElement(by);
        return element.getText();
    }

}
