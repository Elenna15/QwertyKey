package pages.OrderPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class OrderPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(OrderPage.class);
    public static OrderPage instance;

    private OrderPage() {

    }

    public static OrderPage getInstance() {
        if (instance == null) {
            instance = new OrderPage();
        }
        return instance;
    }

    private By keyCaps = By.xpath("//a[text()='Keycaps']");
    private By checkBox = By.xpath("//div[@class='facets-summary']//input[@class='switch']");
    private By keySet = By.xpath("//a[text()='Set taste QwertyKey LiftOff Profil XDA Material PBT']");
    private By addToBasket = By.xpath("//button[@class='button button--xl button--secondary']");
    private By closeButton = By.xpath("//button[@class='drawer__close-icon']");
    private By mouse = By.xpath("//a[text()='Mouse']");
    private By aMouse = By.xpath("//a[text()='Dareu Tiger Wireless Fastcharge - Ediție Limitată']");
    private By seeBasket = By.xpath("//a[text()='Vezi coșul']");
    private By addToBasket2 = By.xpath("//button[@class='button button--xl button--secondary']");
    private By checkout = By.xpath("//button[@class='button button--xl w-full']");
    private By emailField = By.id("email");
    private By fNameField = By.id("TextField0");
    private By sNameField = By.id("TextField1");
    private By addressField = By.id("TextField3");
    private By codeField = By.id("TextField4");
    private By townField = By.id("TextField5");
    private By selectRegion = By.id("Select1");
    private By inputRegion = By.id("Select1");
    private By phoneField = By.id("TextField6");
    private By deliveryBox = By.id("basic-customManualPayment-85511110871");



    public void clickKeyCaps(){
        LOG.info("Clicking the keyCaps button");
        driver.findElement(keyCaps).click();
    }

    public void clickCheckBox(){
        LOG.info("Clicking the box");
        driver.findElement(checkBox).click();
    }

    public void clickKeySet(){
        LOG.info("Choose a key set");
        driver.findElement(keySet).click();
    }

    public void clickAdd(){
        LOG.info("Adding to basket");
        driver.findElement(addToBasket).click();
    }

    public void clickCloseButton(){
        LOG.info("Clicking the close button");
        driver.findElement(closeButton).click();
    }

    public void clickMouse(){
        LOG.info("Clicking the mouse button");
        driver.findElement(mouse).click();
    }

    public void clickAMouse(){
        LOG.info("Clicking a mouse");
        driver.findElement(aMouse).click();
    }
    public void clickAdd2(){
        LOG.info("Adding to basket");
        driver.findElement(addToBasket).click();
    }

    public void clickSeeBasket(){
        LOG.info("See the basket");
        driver.findElement(seeBasket).click();
    }

    public void clickCheckout(){
        LOG.info("Clicking the checkout button");
        driver.findElement(checkout).click();
    }

    public void insertEmail(String email){
        LOG.info("Typing Email");
        driver.findElement(emailField).sendKeys(email);
    }

    public void insertFName(String fName){
        LOG.info("Typing first name");
        driver.findElement(fNameField).sendKeys(fName);
    }

    public void insertSName(String sName){
        LOG.info("Typing second name");
        driver.findElement(sNameField).sendKeys(sName);
    }

    public void insertAddress(String address){
        LOG.info("Typing address");
        driver.findElement(addressField).sendKeys(address);
    }

    public void insertCode(String code){
        LOG.info("Typing code");
        driver.findElement(codeField).sendKeys(code);
    }

    public void insertTown(String town){
        LOG.info("Typing town");
        driver.findElement(townField).sendKeys(town);
    }

    public void selectRegion(String region){
        LOG.info("Selecting region");
        driver.findElement(selectRegion).click();
        driver.findElement(inputRegion).sendKeys(region);
        driver.findElement(selectRegion).sendKeys(Keys.ENTER);
    }

    public void insertPhone(String phone){
        LOG.info("Typing phone");
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void clickDelivery(){
        LOG.info("Clicking delivery with cash");
        driver.findElement(deliveryBox).click();
    }


}
