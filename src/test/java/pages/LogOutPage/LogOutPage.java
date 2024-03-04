package pages.LogOutPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class LogOutPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(LogOutPage.class);
    public static LogOutPage instance;

    private LogOutPage() {

    }

    public static LogOutPage getInstance() {
        if (instance == null) {
            instance = new LogOutPage();
        }
        return instance;
    }

    private By emailField = By.xpath("//input[@name='customer[email]']");
    private By passwordField = By.xpath("//input[@name='customer[password]']");
    private By connectButton = By.xpath("//div[text()='Conectează-te']");
    private By disconnectButton = By.xpath("//a[text()='Deconectează-te']");


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

    public void clickDisconnectButton(){
        LOG.info("Clicking disconnect button");
        driver.findElement(disconnectButton).click();
    }
}
