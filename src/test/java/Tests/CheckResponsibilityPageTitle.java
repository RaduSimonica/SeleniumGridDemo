package Tests;

import driver.BaseClass;
import enums.PageTitle;
import pages.HomePage;
import pages.ResponsibilityPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckResponsibilityPageTitle extends BaseClass {

    @Test
    public void checkResponsibilityPageTitle() {
        HomePage homePage = new HomePage(this.driver);
        homePage.go();
        homePage.clickResponsibilityButton();

        ResponsibilityPage responsibilityPage = new ResponsibilityPage(this.driver);
        Assert.assertEquals(
                responsibilityPage.getTitle(),
                PageTitle.RESPONSIBILITY.get()
        );
    }
}
