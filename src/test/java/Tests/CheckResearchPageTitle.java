package Tests;

import Driver.BaseClass;
import Enums.PageTitle;
import Pages.HomePage;
import Pages.ResearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckResearchPageTitle extends BaseClass {

    @Test
    public void checkResearchPageTitle() {
        HomePage homePage = new HomePage(this.driver);
        homePage.go();
        homePage.clickResearchButton();

        ResearchPage researchPage = new ResearchPage(this.driver);
        Assert.assertEquals(
                researchPage.getTitle(),
                PageTitle.RESEARCH.get()
        );
    }
}
