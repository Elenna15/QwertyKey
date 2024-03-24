package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage() {

    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    private By inputFirstName = By.xpath("//input[@name='customer[first_name]']");
    private By inputLastName = By.xpath("//input[@name='customer[last_name]']");
    private By inputEmail = By.xpath("//input[@name='customer[email]']");
    private By inputPassword = By.xpath("//input[@name='customer[password]']");
    private By create = By.xpath("//button[@class='button button--xl button--secondary w-full']");


    public void insertFirstName(String name){
        LOG.info("Inserting name");
        driver.findElement(inputFirstName).sendKeys(name);
    }

    public void insertLastName(String lastName){
        LOG.info("Inserting last name");
        driver.findElement(inputLastName).sendKeys(lastName);
    }

    public void insertEmail(String email){
        LOG.info("Inserting Email address");
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void insertPassword(String password){
        LOG.info("Inserting password");
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void clickCreateButton(){
        LOG.info("Clicking create button");
        driver.findElement(create).click();
    }
}
