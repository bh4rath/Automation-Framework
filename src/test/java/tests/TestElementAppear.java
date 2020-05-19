package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ElementAppearPage;

public class TestElementAppear extends BaseTest {

    @Test
    public void testElementToAppear(){
        ElementAppearPage elementAppearPage = homePage.clickWaittoAppear();
        String actualText = elementAppearPage.waitForElementAppear();
        Assert.assertEquals(actualText, "Voila! I'm here Guys");
    }




}