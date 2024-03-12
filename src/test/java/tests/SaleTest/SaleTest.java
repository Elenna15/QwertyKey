package tests.SaleTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class SaleTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SaleTest.class);

    String price1 = "50";
    String price2 = "700";



    @Test
    public void salePage(){
        sleep(2000L);

        LOG.info("Click sale button");
        salePage.clickSales();

        LOG.info("Click view all");
        salePage.clickViewAll();

        LOG.info("Click available button");
        salePage.clickAvailableBox();

        LOG.info("Click brand");
        salePage.clickBrandButton();

        LOG.info("Select the option");
        salePage.clickOptionBrand();
        sleep(2000L);

        LOG.info("Click layout");
        salePage.clickLayoutButton();

        LOG.info("Select the option");
        salePage.clickOptionLayout();
        sleep(2000L);

        LOG.info("Click connection");
        salePage.clickConnectionButton();

        LOG.info("Select the option");
        salePage.clickOptionConnection();
        sleep(2000L);

        LOG.info("Click price");
        salePage.clickPriceButton();

        LOG.info("Insert price");
        salePage.insertMinimum(price1);
        sleep(2000L);

        LOG.info("Insert price");
        salePage.insertMaximum(price2);


    }
}
