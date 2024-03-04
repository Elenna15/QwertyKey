package pages.OrderPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
    private By keySet = By.xpath("//a[text()='Set Taste QwertyKey Gganbu']");
    private By addToBasket = By.xpath("//button[@class='button button--xl button--secondary']");
    private By closeButton = By.xpath("//button[@class='drawer__close-icon']");
    private By mouse = By.xpath("//a[text()='Mouse']");
    private By aMouse = By.xpath("//a[text()='Dareu Tiger Wireless Fastcharge - Ediție Limitată']");
    private By seeBasket = By.xpath("//a[text()='Vezi coșul']");
    private By addToBasket2 = By.xpath("//button[@class='button button--xl button--secondary']");
    private By checkout = By.xpath("//button[@class='button button--xl w-full']");



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


}
