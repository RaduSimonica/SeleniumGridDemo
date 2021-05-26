package Pages;

import Utilities.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WhatWeDoPage {

    private DriverUtils driverUtils;

    public WhatWeDoPage(WebDriver driver) {
        this.driverUtils = new DriverUtils(driver);

        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return driverUtils.getPageTitle();
    }
}
