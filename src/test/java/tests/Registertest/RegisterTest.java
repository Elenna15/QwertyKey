package tests.Registertest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "account/register";


    String name = "Elena";
    String lastName = "Negrea";
    String email = "ceva.altceva@" + generateRandomCharacters(5) + ".com";
    String password = "parola1511";

    private String generateRandomCharacters(int i) {
        return null;
    }


    @Test
    public void fillRegister() {
        driver.get(newUrl);
        sleep(3000L);

        LOG.info("Insert name");
        registerPage.insertFirstName(name);

        LOG.info("Insert last name");
        registerPage.insertLastName(lastName);

        LOG.info("Insert Email");
        registerPage.insertEmail(email);

        LOG.info("Insert password");
        registerPage.insertPassword(password);

        LOG.info("Click create button");
        registerPage.clickCreateButton();
    }
}
