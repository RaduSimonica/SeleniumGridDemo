package Driver;

import Utilities.DriverUtils;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    protected WebDriver driver;
    protected DriverUtils driverUtils;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        setupChromeDriver();
        this.driverUtils = new DriverUtils(this.driver);
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
        this.driver.close();
    }

    private void setupChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Driver/chromedriver");

        this.driver = new ChromeDriver(setOptions());

        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    private ChromeOptions setOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("enable-automation");
        chromeOptions.addArguments("--window-size=1920,1080");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--dns-prefetch-disable");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        return chromeOptions;
    }
}
