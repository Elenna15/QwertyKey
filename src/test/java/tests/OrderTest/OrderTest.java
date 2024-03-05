package tests.OrderTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class OrderTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(OrderTest.class);

    String email = "ena99flo@yahoo.com";
    String fName = "Elena";
    String sName = "Negrea";
    String address = "Str Lotus, Nr 55";
    String code = "401564";
    String town = "Turda";
    String region = "Cluj";
    String phone = "0745127783";




    @Test
    public void order(){
        sleep(3000L);


        LOG.info("Click the keyCaps button");
        orderPage.clickKeyCaps();
        sleep(2000L);

        LOG.info("Click the box");
        orderPage.clickCheckBox();
        sleep(2000L);

        LOG.info("Choose a key set");
        orderPage.clickKeySet();
        sleep(2000L);

        LOG.info("Add to basket");
        orderPage.clickAdd();
        sleep(2000L);

        LOG.info("Click the close button");
        orderPage.clickCloseButton();

        LOG.info("Click mouse button");
        orderPage.clickMouse();
        sleep(3000L);


        LOG.info("Click on the mouse");
        orderPage.clickAMouse();
        sleep(2000L);

        LOG.info("Add to basket");
        orderPage.clickAdd();
        sleep(2000L);

        LOG.info("See the basket");
        orderPage.clickSeeBasket();

        LOG.info("Click checkout");
        orderPage.clickCheckout();
        sleep(2000L);

        LOG.info("Type email");
        orderPage.insertEmail(email);

        LOG.info("Type first name");
        orderPage.insertFName(fName);

        LOG.info("Type second name");
        orderPage.insertSName(sName);

        LOG.info("Type address");
        orderPage.insertAddress(address);

        LOG.info("Type code");
        orderPage.insertCode(code);

        LOG.info("Type town");
        orderPage.insertTown(town);

        LOG.info("Select region");
        orderPage.selectRegion(region);

        LOG.info("Type phone");
        orderPage.insertPhone(phone);

        LOG.info("Click delivery");
        orderPage.clickDelivery();



    }
}
