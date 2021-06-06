package pages;

import utilities.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

    private DriverUtils driverUtils;

    public ContactPage(WebDriver driver) {
        this.driverUtils = new DriverUtils(driver);

        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return driverUtils.getPageTitle();
    }
}
