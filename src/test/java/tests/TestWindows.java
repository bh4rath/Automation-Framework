package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WindowPage;

public class TestWindows extends BaseTest {

    @Test
    public void testOpenNewWindow(){
        WindowPage windowPage = homePage.clickWindow();
        windowPage.clickOpenHomePage();
        String actualTitle = windowPage.getNewWindowPageTite();
        Assert.assertEquals(actualTitle, "TestLeaf - Selenium Playground");
    }

    @Test
    public void testNoOfOpenedNewWindow(){
        WindowPage windowPage = homePage.clickWindow();
        windowPage.clickOpenMultipleWindow();
        int windowCount = windowPage.getNoOfOpenedWindowCount();
        Assert.assertEquals(windowCount, 3);
    }

    @Test
    public void testDoNotCloseWindow(){
        WindowPage windowPage = homePage.clickWindow();
        windowPage.clickDoNotCloseWindow();
    }

    @Test
    public void testWaitForWindowToOpen(){
        WindowPage windowPage = homePage.clickWindow();
        windowPage.clickWaitForWindowToOpen();
    }
}