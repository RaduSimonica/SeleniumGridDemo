package utilities;

import enums.PageTitle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtils {

    private WebDriver driver;
    private Actions actions;
    private WebDriverWait wait;

    public DriverUtils(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(this.driver, 40);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void moveToElementAndClick(WebElement element) {
        this.actions.moveToElement(element)
                .click(element)
                .perform();
    }
}
