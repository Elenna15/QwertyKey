package pages.NewAddressPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class NewAddressPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(NewAddressPage.class);
    public static NewAddressPage instance;

    private NewAddressPage() {

    }

    public static NewAddressPage getInstance() {
        if (instance == null) {
            instance = new NewAddressPage();
        }
        return instance;
    }
    private By emailField = By.xpath("//input[@name='customer[email]']");
    private By passwordField = By.xpath("//input[@name='customer[password]']");
    private By connectButton = By.xpath("//div[text()='Conectează-te']");
    private By addressButton = By.xpath("//a[text()='Adrese']");
    private By addAddress = By.xpath("//div[text()='Adaugă o adresă']");
    private By nameField = By.xpath("//form[@id='address_form_new']//div[@class='address-form']//input[@name='address[first_name]']");

    public void insertEmail(String email){
        LOG.info("Typing Email");
        driver.findElement(emailField).sendKeys(email);
    }

    public void insertPassword(String password){
        LOG.info("Typing password");
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickConnectButton(){
        LOG.info("Clicking connect button");
        driver.findElement(connectButton).click();
    }

    public void clickAddressButton(){
        LOG.info("Clicking the address button");
        driver.findElement(addressButton).click();
    }

    public void clickAdd(){
        LOG.info("Clicking add address");
        driver.findElement(addAddress).click();
    }

    public void insertName(String name){
        LOG.info("Typing name");
        driver.findElement(nameField).sendKeys(name);
    }
}
