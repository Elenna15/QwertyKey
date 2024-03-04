package tests.NewAddressTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;


import static pages.BasePage.*;

public class NewAddressTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(NewAddressTest.class);
    private String newUrl = getBaseUrl() + "account/addresses";

    String email = "ena99flo@yahoo.com";
    String password = "parola1511";
    String name = "Ana";


    @Test
    public void newAddress(){
        driver.get(newUrl);
        sleep(3000L);

        LOG.info("Type Email");
        newAddressPage.insertEmail(email);

        LOG.info("Type password");
        newAddressPage.insertPassword(password);

        LOG.info("Click the connect button");
        signInPage.clickConnectButton();
        sleep(3000L);

        LOG.info("Click address button");
        newAddressPage.clickAddressButton();
        sleep(2000L);

        LOG.info("Click add");
        newAddressPage.clickAdd();
        sleep(3000L);

        LOG.info("Type name");
        newAddressPage.insertName(name);
    }
}
