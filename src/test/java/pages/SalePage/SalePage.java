package pages.SalePage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
    private By connectionButton = By.xpath("//button//span[text()='Tip Conexiune']");
    private By priceButton = By.xpath("//button//span[text()='Preț']");
    private By minimumPrice = By.xpath("//facet-dialog//input[@id='filter.v.price.gte']");
    private By maximumPrice = By.xpath("//facet-dialog//input[@id='filter.v.price.lte']");


    public void clickSales() {
        LOG.info("Clicking the sales button");
        WebDriverWait wait=new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[text()='Reduceri']")));
        driver.findElement(salesButton).click();
    }

    public void clickViewAll() {
        LOG.info("Clicking view all button");
        driver.findElement(viewAll).click();
    }

    public void clickAvailableBox(){
        LOG.info("Clicking available button");
        driver.findElement(availableBox).click();
    }

    public void clickBrandButton() {
        LOG.info("Clicking the brand button");
        WebDriverWait wait=new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//button/span[text()='Brand']")));
        driver.findElement(brandButton).click();
    }

    public void clickOptionBrand() {
        LOG.info("Selecting the option");
        driver.findElement(optionBrand).click();
    }

    public boolean isDisplayedLayoutButton() {
        LOG.info("Verify if layout button is displayed");
        WebDriverWait wait=new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//button/span[text()='Layout Tastatura']")));
        return driver.findElement(layoutButton).isDisplayed();
    }


    public boolean isDisplayedConnectionButton() {
        LOG.info("Verify if connection button is displayed ");
        return driver.findElement(connectionButton).isDisplayed();
    }


    public void clickPriceButton(){
        LOG.info("Clicking the price button");
        WebDriverWait wait=new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//button//span[text()='Preț']")));
        driver.findElement(priceButton).click();
    }

    public void insertMinimum(String price1){
        LOG.info("Inserting price");
        driver.findElement(minimumPrice).sendKeys(price1);
    }

    public void insertMaximum(String price2){
        LOG.info("Inserting price");
        driver.findElement(maximumPrice).sendKeys(price2);
    }

}
