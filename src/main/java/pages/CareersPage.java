package pages;

import utilities.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CareersPage {

    private DriverUtils driverUtils;

    public CareersPage(WebDriver driver) {
        this.driverUtils = new DriverUtils(driver);

        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return driverUtils.getPageTitle();
    }
}
