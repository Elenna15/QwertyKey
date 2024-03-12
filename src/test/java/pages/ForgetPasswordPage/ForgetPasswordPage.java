package pages.ForgetPasswordPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class ForgetPasswordPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(ForgetPasswordPage.class);
    public static ForgetPasswordPage instance;

    private ForgetPasswordPage() {

    }

    public static ForgetPasswordPage getInstance() {
        if (instance == null) {
            instance = new ForgetPasswordPage();
        }
        return instance;
    }

    private By forgetPassButton = By.xpath("//a[text()='Ti-ai uitat parola']");
    private By inputEmail = By.xpath("//input[@name='email']");
    private By resetButton = By.xpath("//form[@action='/account/recover']//button[@is='custom-button']");


    public void clickForgetButton(){
        LOG.info("Clicking the forget password button");
        driver.findElement(forgetPassButton).click();
    }

    public void insertEmail(String email){
        LOG.info("Inserting Email address");
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void clickResetButton(){
        LOG.info("Clicking the reset button");
        driver.findElement(resetButton).click();
    }
}
