package Tests;

import Driver.BaseClass;
import Enums.PageTitle;
import Pages.CareersPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckCareersPageTitle extends BaseClass {

    @Test
    public void checkCareersPageTitle() {
        HomePage homePage = new HomePage(this.driver);
        homePage.go();
        homePage.clickCareersButton();

        CareersPage careersPage = new CareersPage(this.driver);
        Assert.assertEquals(
                careersPage.getTitle(),
                PageTitle.CAREERS.get()
        );
    }
}
