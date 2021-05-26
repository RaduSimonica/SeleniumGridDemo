package Tests;

import Driver.BaseClass;
import Enums.PageTitle;
import Pages.ContactPage;
import Pages.HomePage;
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
