package Tests;

import driver.BaseClass;
import enums.PageTitle;
import pages.HomePage;
import pages.WhoWeArePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckWhoWeArePageTitle extends BaseClass {

    @Test
    public void checkWhoWeArePageTitle() {
        HomePage homePage = new HomePage(this.driver);
        homePage.go();
        homePage.clickWhoWeAreButton();

        WhoWeArePage whoWeArePage = new WhoWeArePage(this.driver);
        Assert.assertEquals(
                whoWeArePage.getTitle(),
                PageTitle.WHO_WE_ARE.get()
        );
    }
}
