package WebAutomationTest;

import org.openqa.selenium.By;

public class ConstantsInceHesap {
    public static final By mainPageLogo = By.cssSelector("div[class='logo'] a");
    public static final By loginButton = By.cssSelector("div[class='login'] a");
    public static final By inputUserName = By.id("top-user-username");
    public static final By inputPassword = By.id("top-user-password");
    public static final By clickLogin = By.id("btn-ih-giris");
    public static final By controlLoginText = By.cssSelector("div[class='login1'] a span");
    public static final By logOutButton = By.cssSelector("a[href='/uye/logout.php']");
    public static final By searchInput = By.id("query");
    public static final By searchClick = By.cssSelector("form[id='search-main']>button[type='submit']");
    public static final By searchPageControl = By.xpath("//div[@class='block links']/h1");
    public static final By productList = By.cssSelector("div[class='product-item']");
    public static final By addCartProduct = By.cssSelector("a[class='btn btn-to-cart']");
    public static final By myCardIcon = By.cssSelector("div[class='cart'] a[class='arr']");
    public static final By myCardItem = By.cssSelector("div[class='cart-top'] ul li");
    public static final By navTabButton = By.cssSelector("nav[class='all']");
    public static final By pcPageBack = By.cssSelector("a[href='/pc-bilgisayar-fiyatlari/']");
    public static final By closeSelect = By.id("onesignal-slidedown-cancel-button");
    public static final By closeChose = By.cssSelector("button[class='btn btn-primary btn-cerez']");
    public static final By removeMyCard = By.cssSelector("a[class='delete-this remove-product']");
    public static final By removeAcceptItem = By.cssSelector("button[class='btn btn-dialog ih-yes']");

}
