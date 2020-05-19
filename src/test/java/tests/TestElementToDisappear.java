package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ElementDisappearPage;

public class TestElementToDisappear extends BaseTest {

    @Test
    public void testElementToDisappear(){
        ElementDisappearPage elementDisappearPage = homePage.clickWaittoDisappear();
        elementDisappearPage.waitForElementToDisappear();
        String actualText = elementDisappearPage.getText();
        Assert.assertEquals(actualText, "I know you can do it! Button is disappeared!");
    }
}