package tests.OrderTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class OrderTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(OrderTest.class);






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



    }
}
