package tests.QuestionTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class QuestionTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(QuestionTest.class);
    private String newUrl = getBaseUrl() + "pages/contact";

    String name = "Ana";
    String email = "ceva.altceva@" + generateRandomCharacters(5) + ".com";
    String department = "Comenzi";
    String message = "Buna! In cat timp pot face retur ?";

    private String generateRandomCharacters(int i) {
        return null;
    }

    @Test
    public void sendQuestion(){
        driver.get(newUrl);
        sleep(3000L);


        LOG.info("Verify question tag");
        Assert.assertTrue(questionPage.isQuestionTagDisplayed(), "Tag is not displayed");

        LOG.info("Insert name");
        questionPage.insertName(name);

        LOG.info("Insert Email address");
        questionPage.insertEmail(email);

        LOG.info("Select department");
        questionPage.selectDepartment(department);

        LOG.info("Insert message");
        questionPage.insertMessage(message);

        LOG.info("Click send button");
        questionPage.clickSendButton();


    }
}
