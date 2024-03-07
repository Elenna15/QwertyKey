package pages.QuestionPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class QuestionPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(QuestionPage.class);
    public static QuestionPage instance;

    private QuestionPage() {

    }

    public static QuestionPage getInstance() {
        if (instance == null) {
            instance = new QuestionPage();
        }
        return instance;
    }

    private By questionTag = By.xpath("//h2[text()='Ai o intrebare?']");
    private By inputName = By.xpath("//input[@name='contact[name]']");
    private By inputEmail = By.xpath("//form[@class='form']//input[@name='contact[email]']");
    private By selectDepartment = By.xpath("//select[@name='contact[Selecteaza departamentul]']");
    private By inputMessage = By.xpath("//textarea[@name='contact[body]']");
    private By sendButton = By.xpath("//button[@is='custom-button']");


    public boolean isQuestionTagDisplayed(){
        LOG.info("Verify if question tag displayed");
        return driver.findElement(questionTag).isDisplayed();
    }

    public void insertName(String name){
        LOG.info("Inserting your name");
        driver.findElement(inputName).sendKeys(name);
    }

    public void insertEmail(String email){
        LOG.info("Inserting Email address");
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void selectDepartment(String department){
        LOG.info("Selecting department");
        Select newDepartment = new Select(driver.findElement(selectDepartment));
        newDepartment.selectByValue(department);
    }

    public void insertMessage(String message){
        LOG.info("Inserting message");
        driver.findElement(inputMessage).sendKeys(message);
    }

    public void clickSendButton(){
        LOG.info("Clicking send button");
        WebDriverWait wait=new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//button[@is='custom-button']")));
        driver.findElement(sendButton).click();
    }
}
