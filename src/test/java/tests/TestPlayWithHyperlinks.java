package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrokenPage;
import pages.HomePage;
import pages.HyperLinkPage;
import java.util.List;

public class TestPlayWithHyperlinks extends BaseTest {

    @Test()
    public void testGoToHomePage() {
        HyperLinkPage hyperLinkPage = homePage.clickHyperlinkComponent();
        HomePage homePage = hyperLinkPage.clickGoToHomePage();
        String pageTitle = homePage.getPageTitle();
        Assert.assertEquals(pageTitle, "TestLeaf - Selenium Playground");
    }

    @Test
    public void testGotoLinkPage() {
        HyperLinkPage hyperLinkPage = homePage.clickHyperlinkComponent();
        String actualLinkText = hyperLinkPage.getGoToLinkPageTitle();
        Assert.assertEquals(actualLinkText, "http://www.leafground.com/pages/Button.html");
    }

    @Test
    public void testBrokenLinkPage() {
        HyperLinkPage hyperLinkPage = homePage.clickHyperlinkComponent();
        BrokenPage brokenPage = hyperLinkPage.clickGoToBrokenPage();
        String actualPageTitle = brokenPage.getPageTitle();
        Assert.assertEquals(actualPageTitle, "TestLeaf - Selenium Playground");
    }

    @Test
    public void testAllLinksInThePage() {
        HyperLinkPage hyperLinkPage = homePage.clickHyperlinkComponent();
        List<WebElement> allLinks = hyperLinkPage.getTotalHyperLinks();
        Assert.assertEquals(allLinks.size(), 6);
    }
}