package tests.ForgetPasswordTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

import static pages.BasePage.*;

public class ForgetPasswordTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(ForgetPasswordTest.class);
    private String newUrl = getBaseUrl() + "account/login";

    String email = "ceva.altceva@" + generateRandomCharacters(5) + ".com";

    private String generateRandomCharacters(int i) {
        return null;
    }


    @Test
    public void forgetPass(){
        driver.get(newUrl);
        sleep(3000L);


        LOG.info("Click the button");
        forgetPasswordPage.clickForgetButton();

        LOG.info("Insert Email address");
        forgetPasswordPage.insertEmail(email);
        sleep(2000L);

        LOG.info("Click reset button");
        forgetPasswordPage.clickResetButton();
    }
}
