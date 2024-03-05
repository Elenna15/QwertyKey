package pages.SalePage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SalePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SalePage.class);
    public static SalePage instance;

    private SalePage() {

    }

    public static SalePage getInstance() {
        if (instance == null) {
            instance = new SalePage();
        }
        return instance;
    }

    private By salesButton = By.xpath("//a[text()='Reduceri']");
    private By viewAll = By.xpath("//span[text()='View all']");
    private By availableBox = By.xpath("//div[@class='availability-facet']/input[@class='switch']");
    private By brandButton = By.xpath("//button/span[text()='Brand']");
    private By optionBrand = By.xpath("//label[@for='checkbox-template--20546056061262__main-filter.p.m.custom.brand-3']");
    private By layoutButton = By.xpath("//button/span[text()='Layout Tastatura']");
    private By optionLayout = By.xpath("//label[@for='checkbox-template--20546056061262__main-filter.p.m.custom.layout_tastatura-2']");
    private By connectionButton = By.xpath("//button//span[text()='Tip Conexiune']");
    private By optionConnection = By.xpath("//label[@for='checkbox-template--20546056061262__main-filter.p.m.custom.tip_conexiune-2']");
    private By priceButton = By.xpath("//button//span[text()='Preț']");

    public void clickSales() {
        LOG.info("Clicking the sales button");
        driver.findElement(salesButton).click();
    }

    public void clickViewAll() {
        LOG.info("Clicking view all button");
        driver.findElement(viewAll).click();
    }

    public void clickBrandButton() {
        LOG.info("Clicking the brand button");
        driver.findElement(brandButton).click();
    }

    public void clickOptionBrand() {
        LOG.info("Selecting the option");
        driver.findElement(optionBrand).click();
    }

    public void clickLayoutButton() {
        LOG.info("Clicking the layout button");
        driver.findElement(layoutButton).click();
    }

    public void clickOptionLayout() {
        LOG.info("Selecting the option");
        driver.findElement(optionLayout).click();
    }

    public void clickConnectionButton() {
        LOG.info("Clicking type of connection button ");
        driver.findElement(connectionButton).click();
    }

    public void clickOptionConnection() {
        LOG.info("Selecting option");
        driver.findElement(optionConnection).click();
    }

    public void clickPriceButton(){
        LOG.info("Clicking the price button");
        driver.findElement(priceButton).click();
    }


}
