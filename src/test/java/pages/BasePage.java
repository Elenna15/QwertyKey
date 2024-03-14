package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUp(){
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver121.exe");
        driver = new ChromeDriver();
        String url = "https://qwertykey.ro/";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;


        LOG.info("Open browser maximize");
        driver.manage().window().maximize();
    }

    public static void tearDown(){
        LOG.info("Close the browser");
        driver.quit();
    }

    public static String returnBaseUrl(){
        return "https://qwertykey.ro/";
    }

    public static String getBaseUrl(){
        String baseurl = returnBaseUrl();
        if (baseurl != null){
            return baseurl.replace("Index.html", "");
        }
        return baseurl;
    }

    public static void sleep(long ms){
        try {
            Thread.sleep(ms);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }



}