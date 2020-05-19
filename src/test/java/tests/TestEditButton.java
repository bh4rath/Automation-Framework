package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EditPage;

public class TestEditButton extends BaseTest {

    @Test(description = "This test verifies the Edit Button Page")
    public void testButtonEdit() {
        EditPage editPage = homePage.clickEditComponent();
        editPage.setEamilAddress("test@gmail.com");
        editPage.setAppendText("Updated");
        String actual = editPage.getTestLeafText();
        Assert.assertEquals(actual, "TestLeaf");
        editPage.clearText();
        assert editPage.isBlank();
        String isDisabled = editPage.isDisabled();
        Assert.assertEquals(isDisabled, "true");
    }
}