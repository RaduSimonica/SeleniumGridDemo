package Tests;

import Driver.BaseClass;
import Pages.HomePage;
import Pages.MediaPage;
import Enums.PageTitle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckMediaPageTitle extends BaseClass {

    @Test
    public void checkMediaPageTitle() {
        HomePage homePage = new HomePage(this.driver);
        homePage.go();
        homePage.clickMediaButton();

        MediaPage mediaPage = new MediaPage(this.driver);
        Assert.assertEquals(
                mediaPage.getTitle(),
                PageTitle.MEDIA.get()
        );
    }
}
