package pages;

import utilities.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ResponsibilityPage {

    private DriverUtils driverUtils;

    public ResponsibilityPage(WebDriver driver) {
        this.driverUtils = new DriverUtils(driver);

        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return driverUtils.getPageTitle();
    }
}
