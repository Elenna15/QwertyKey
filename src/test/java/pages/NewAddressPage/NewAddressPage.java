package pages.NewAddressPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
    private By secondNameField = By.xpath("//form[@id='address_form_new']//input[@name='address[last_name]']");
    private By phoneField = By.xpath("//form[@id='address_form_new']//input[@name='address[phone]']");
    private By address1Field = By.xpath("//form[@id='address_form_new']//input[@name='address[address1]']");
    private By address2Field = By.xpath("//form[@id='address_form_new']//input[@name='address[address2]']");
    private By cityField = By.xpath("//form[@id='address_form_new']//input[@name='address[city]']");
    private By codeField = By.xpath("//form[@id='address_form_new']//input[@name='address[zip]']");
    private By selectRegion = By.xpath("//form[@id='address_form_new']//select[@name='address[province]']");
    private By saveButton = By.xpath("//form[@id='address_form_new']//button[@is='custom-button']");



    public void clickAddressButton(){
        LOG.info("Clicking the address button");
        WebDriverWait wait=new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[text()='Adrese']")));
        driver.findElement(addressButton).click();
    }

    public void clickAdd(){
        LOG.info("Clicking add address");
        WebDriverWait wait=new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//div[text()='Adaugă o adresă']")));
        driver.findElement(addAddress).click();
    }

    public void insertName(String name){
        LOG.info("Typing name");
        driver.findElement(nameField).sendKeys(name);
    }

    public void insertSecondName(String name2){
        LOG.info("Typing second name");
        driver.findElement(secondNameField).sendKeys(name2);
    }

    public void insertPhone(String phone){
        LOG.info("Typing phone number");
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void insertAddress1(String address1){
        LOG.info("Typing first address");
        driver.findElement(address1Field).sendKeys(address1);
    }

    public void insertAddress2(String address2){
        LOG.info("Typing second address");
        driver.findElement(address2Field).sendKeys(address2);
    }

    public void insertCity(String city){
        LOG.info("Typing city");
        driver.findElement(cityField).sendKeys(city);
    }

    public void insertCode(String code){
        LOG.info("Typing code");
        driver.findElement(codeField).sendKeys(code);
    }

    public void selectRegion(String region){
        LOG.info("Selecting region");
        Select newRegion = new Select(driver.findElement(selectRegion));
        newRegion.selectByValue(region);
    }

    public void clickSaveButton(){
        LOG.info("Clicking the save button");
        driver.findElement(saveButton).click();
    }
}
