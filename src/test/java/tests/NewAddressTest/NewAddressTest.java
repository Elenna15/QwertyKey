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
    String name = "Florin";
    String name2 = "Pop";
    String phone = "0746228351";
    String address1 = "Str Lianelor, Nr 14";
    String address2 = "Micro 2, Str Republicii";
    String city = "Turda";
    String code = "402318";
    String region = "Hunedoara";


    @Test
    public void newAddress() {
        driver.get(newUrl);
        sleep(3000L);

        LOG.info("Type Email");
        signInPage.insertEmail(email);

        LOG.info("Type password");
        signInPage.insertPassword(password);

        LOG.info("Click the connect button");
        signInPage.clickConnectButton();
        sleep(3000L);

        LOG.info("Click address button");
        newAddressPage.clickAddressButton();

        LOG.info("Click add");
        newAddressPage.clickAdd();

        LOG.info("Type name");
        newAddressPage.insertName(name);

        LOG.info("Type second name");
        newAddressPage.insertSecondName(name2);

        LOG.info("Type phone number");
        newAddressPage.insertPhone(phone);

        LOG.info("Type first address");
        newAddressPage.insertAddress1(address1);

        LOG.info("Type second address");
        newAddressPage.insertAddress2(address2);

        LOG.info("Type city");
        newAddressPage.insertCity(city);

        LOG.info("Type code");
        newAddressPage.insertCode(code);

        LOG.info("Select region");
        newAddressPage.selectRegion(region);

        LOG.info("Click on the save button");
        newAddressPage.clickSaveButton();
        sleep(2000L);

    }
}
