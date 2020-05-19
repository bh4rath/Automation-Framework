package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ButtonPage;
import pages.HomePage;

public class TestBondWithButtons extends BaseTest {

    @Test
    public void testNavigateHomePage(){
        ButtonPage buttonPage = homePage.clickButtonComponent();
        HomePage homePage = buttonPage.clickGoToHomePageButton();
        String pageTitle = homePage.getPageTitle();
        Assert.assertEquals(pageTitle, "TestLeaf - Selenium Playgrounds");
    }

    @Test
    public void testButtonColor(){
        ButtonPage buttonPage = homePage.clickButtonComponent();
        String colorCode = buttonPage.getCssValueOfButton();
        Assert.assertEquals(colorCode, "rgba(144, 238, 144, 1)");
    }

    @Test
    public void testButtonPosition(){
        ButtonPage buttonPage = homePage.clickButtonComponent();
        System.out.println(buttonPage.getButtonXPostion());
        System.out.println(buttonPage.getButtonYPosition());
    }

    @Test
    public void testButtonHeightAndWidth(){
        ButtonPage buttonPage = homePage.clickButtonComponent();
        System.out.println(buttonPage.getWidth());
        System.out.println(buttonPage.getHeight());
    }
}