package Tests;

import driver.BaseClass;
import enums.PageTitle;
import pages.HomePage;
import pages.InvestorRelationsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckInvestorRelationsPage extends BaseClass {

    @Test
    public void checkInvestorRelationsPageTitle() {
        HomePage homePage = new HomePage(this.driver);
        homePage.go();
        homePage.clickInvestorRelationsButton();

        InvestorRelationsPage investorRelationsPage = new InvestorRelationsPage(this.driver);
        Assert.assertEquals(
                investorRelationsPage.getTitle(),
                PageTitle.INVESTOR_RELATIONS.get()
        );
    }
}
