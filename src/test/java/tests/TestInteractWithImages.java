package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ImagePage;

import java.net.MalformedURLException;

public class TestInteractWithImages extends BaseTest {

    @Test
    public void testClickOnImage() {
        ImagePage imagePage = homePage.ClickOnTheImage();
        HomePage homePage = imagePage.clickImage();
        String actualPageTitle = homePage.getPageTitle();
        Assert.assertEquals(actualPageTitle, "TestLeaf - Selenium Playground");
    }

    @Test
    public void testBrokenImage() throws MalformedURLException {
        ImagePage imagePage = homePage.ClickOnTheImage();
        int actualResponseCode = imagePage.clickBrokenImage();
        Assert.assertEquals(actualResponseCode, 200);
    }
}