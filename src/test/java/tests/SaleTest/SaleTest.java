package tests.SaleTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class SaleTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SaleTest.class);



    @Test
    public void salePage(){
        sleep(2000L);

        LOG.info("Click sale button");
        salePage.clickSales();
        sleep(2000L);

        LOG.info("Click view all");
        salePage.clickViewAll();

        LOG.info("Click brand");
        salePage.clickBrandButton();
        sleep(2000L);

        LOG.info("Select the option");
        salePage.clickOptionBrand();
        sleep(2000L);

        LOG.info("Click layout");
        salePage.clickLayoutButton();
        sleep(2000L);

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



    }
}
