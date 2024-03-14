package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {

    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    private By logo = By.xpath("//img[@class='header__logo-image']");
    private By emailField = By.xpath("//input[@name='customer[email]']");
    private By passwordField = By.xpath("//input[@name='customer[password]']");
    private By connectButton = By.xpath("//div[text()='Conectează-te']");
    private By logo2 = By.xpath("//h2[text()='Alege QwertyKey!']");

    public boolean isLogoDisplayed(){
        LOG.info("Verify if logo displayed");
        return driver.findElement(logo).isDisplayed();
    }

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

    public boolean isLogo2Displayed(){
        LOG.info("Verify if logo Choose QwertyKey is displayed");
        return driver.findElement(logo2).isDisplayed();
    }
}
