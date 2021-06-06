package pages;

import enums.PageTitle;
import enums.Url;
import utilities.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

    private WebDriver driver;
    private DriverUtils driverUtils;

    @FindBy(xpath = "//nav[@class=\"navigation-cross\"]/ul/li/a[@title=\"Media\"]")
    private WebElement media;

    @FindBy(xpath = "//nav[@class=\"navigation-cross\"]/ul/li/a[@title=\"Careers\"]")
    private WebElement careers;

    @FindBy(xpath = "//nav[@class=\"navigation-cross\"]/ul/li/a[@title=\"Investor Relations\"]")
    private WebElement investorRelations;

    @FindBy(xpath = "//nav[@class=\"navigation-cross\"]/ul/li/a[@title=\"Research\"]")
    private WebElement research;

    @FindBy(xpath = "//nav[@class=\"navigation-cross\"]/ul/li/a[@title=\"#Positiveimpact\"]")
    private WebElement positiveImpact;

    @FindBy(xpath = "//nav[@class=\"navigation-cross\"]/ul/li/a[@title=\"Responsibility\"]")
    private WebElement responsibility;

    @FindBy(xpath = "/html/body/header/div[1]/nav/ul/li[7]/a")
    private WebElement contact;

    @FindBy(xpath = "//*[@id=\"what-we-do_top\"]/a")
    private WebElement whatWeDo;

    @FindBy(xpath = "//*[@id=\"who-we-are_top\"]/a")
    private WebElement whoWeAre;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.driverUtils = new DriverUtils(driver);

        PageFactory.initElements(driver, this);
    }

    public void go() {
        this.driver.navigate().to(Url.HOME_PAGE.get());
        Assert.assertEquals(
                driverUtils.getPageTitle(),
                PageTitle.HOME.get()
        );
    }

    public void clickMediaButton() {
        this.media.click();
    }

    public void clickCareersButton() {
        this.careers.click();
    }

    public void clickInvestorRelationsButton() {
        this.investorRelations.click();
    }

    public void clickResearchButton() {
        this.research.click();
    }

    public void clickResponsibilityButton() {
        this.responsibility.click();
    }

    public void clickContactButton() {
        this.contact.click();
    }

    public void clickWhoWeAreButton() {
        driverUtils.moveToElementAndClick(this.whoWeAre);
    }

    public void clickWhatWeDoButton() {
        driverUtils.moveToElementAndClick(this.whatWeDo);
    }
}
