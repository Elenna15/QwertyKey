package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);
    private String newUrl = getBaseUrl() + "account/login";

    String email = "ena99flo@yahoo.com";
    String password = "parola1511";


    @Test
    public void signIn(){
        driver.get(newUrl);
        sleep(3000L);

        LOG.info("Verify logo");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");

        LOG.info("Type Email");
        signInPage.insertEmail(email);

        LOG.info("Type password");
        signInPage.insertPassword(password);

        LOG.info("Click the connect button");
        signInPage.clickConnectButton();

    }
}
