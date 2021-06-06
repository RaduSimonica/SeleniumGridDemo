package Tests;

import driver.BaseClass;
import enums.PageTitle;
import pages.ContactPage;
import pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckContactPageTitle extends BaseClass {

    @Test
    public void checkContactPageTitle() {
        HomePage homePage = new HomePage(this.driver);
        homePage.go();
        homePage.clickContactButton();

        ContactPage contactPage = new ContactPage(this.driver);
        Assert.assertEquals(
                contactPage.getTitle(),
                PageTitle.CONTACT.get()
        );
    }
}
