package Tests;

import Driver.BaseClass;
import Enums.PageTitle;
import Pages.HomePage;
import Pages.WhatWeDoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckWhatWeDoPageTitle extends BaseClass {

    @Test
    public void checkWhatWeDoPageTitle() {
        HomePage homePage = new HomePage(this.driver);
        homePage.go();
        homePage.clickWhatWeDoButton();

        WhatWeDoPage whatWeDoPage = new WhatWeDoPage(this.driver);
        Assert.assertEquals(
                whatWeDoPage.getTitle(),
                PageTitle.WHAT_WE_DO.get()
        );
    }
}
