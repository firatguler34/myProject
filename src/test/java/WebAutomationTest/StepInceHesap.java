package WebAutomationTest;

import WebAutomationBase.BasePage;
import WebAutomationBase.BaseTest;
import com.thoughtworks.gauge.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StepInceHesap extends BasePage {
    private final Logger log = LogManager.getLogger(StepInceHesap.class);


    @Step("Username : <username> Password : <pass> gir ve kontrol et : <accountname>")
    public void firstTest(String username, String pass, String acountname) {
        sendKeys(ConstantsInceHesap.inputUserName, username);
        sendKeys(ConstantsInceHesap.inputPassword, pass);
        click(ConstantsInceHesap.clickLogin);
        Assert.assertEquals("Hesap ismi hatali", acountname, elementGetText(ConstantsInceHesap.controlLoginText));
        log.info("Giris islemi yapildi ve kontrol edildi");
    }

    @Step("butona bas")
    public void clickButton() {
        click(ConstantsInceHesap.loginButton);
    }

    @Step("cikis yapp")
    public void logOut() {
        click(ConstantsInceHesap.logOutButton);
    }

    @Step("Arama butonuna :<txt> ekle")
    public void searchSend(String txt) {
        sendKeys(ConstantsInceHesap.searchInput, txt);
    }

    @Step("Arama butonuna bas")
    public void searchClick() {
        click(ConstantsInceHesap.searchClick);
    }

    @Step("Arama sayfasi kontrol et <txt>")
    public void verifiySearchPage(String txt) {
        Assert.assertEquals("Aranan bilgi gelmedi", txt, elementGetText(ConstantsInceHesap.searchPageControl));
        log.info("Arama sayfası acildigi dogrulandı");
    }

    @Step("Arama sayfasindan rastgele bir urun sec")
    public void randomSelectProduct() {
        List<WebElement> elements = findElements(ConstantsInceHesap.productList);
        actionAndClickElement(elements.get(randomNumber(elements.size())));

    }


    @Step("Sepete urun ekle")
    public void addToCard() {
        actionAndClickElementWithJs(ConstantsInceHesap.addCartProduct);
    }
    @Step("Sepette urun oldugunu kontrol et")
    public void controlMyCard() {
        click(ConstantsInceHesap.myCardIcon);
        List<WebElement> elements = findElements(ConstantsInceHesap.myCardItem);
        Assert.assertNotNull("Sepette urun elementi bulunamadi",elements);
        log.info("urunun sepette oldugu kontrol edildi");
    }
    @Step("Sepette urun <count> oldugunu kontrol")
    public void controlMyCard(int count) {
        click(ConstantsInceHesap.myCardIcon);
        List<WebElement> elements = findElements(ConstantsInceHesap.myCardItem);
        Assert.assertEquals("sepette urun sayisi 2 ",count,elements.size());
        log.info("urunlerin sepette oldugu kontrol edildi");
    }
    @Step("Navbar ustune git")
    public void actionToElementNav() {
        actionElement(ConstantsInceHesap.navTabButton);
    }
    @Step("Geri git")
    public void backToSearchPage() {
        click(ConstantsInceHesap.pcPageBack);
    }
    @Step("Pencere kapat")
    public void close() {
        click(ConstantsInceHesap.closeSelect);
    }
    @Step("Pencere chose kapat")
    public void closeChose() {
        click(ConstantsInceHesap.closeChose);
    }
    @Step("Search buton tikla")
    public void searchhh() {
        click(ConstantsInceHesap.searchInput);
    }

    @Step("<seconds> bekle")
    public void waitBySeconds(int seconds) {
        try {
            log.info(seconds + " saniye bekleniyor.");
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public int randomNumber(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }

}
