package tests.LogOutTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

import static pages.BasePage.*;

public class LogOutTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(LogOutTest.class);
    private String newUrl = getBaseUrl() + "account";

    String email = "ena99flo@yahoo.com";
    String password = "parola1511";


    @Test
    public void logOut(){
        driver.get(newUrl);
        sleep(2000L);


        LOG.info("Type Email");
        signInPage.insertEmail(email);

        LOG.info("Type password");
        signInPage.insertPassword(password);

        LOG.info("Click the connect button");
        signInPage.clickConnectButton();
        sleep(2000L);

        LOG.info("Click disconnect button");
        logOutPage.clickDisconnectButton();

        LOG.info("Verify account button");
        Assert.assertTrue(logOutPage.isAccountButtonDisplayed(), "Button is not displayed");


    }
}
