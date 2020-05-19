package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AlertPage;

public class TestAlerts extends BaseTest {

    @Test
    public void testAlert(){
        AlertPage alertPage = homePage.ClickOnAlert();
        alertPage.clickAlertBox();
    }

    @Test
    public void testConfirmAlert(){
        AlertPage alertPage = homePage.ClickOnAlert();
        alertPage.clickConfirmBox();
        String resultText = alertPage.getResultText();
        Assert.assertEquals(resultText, "You pressed OK!");
    }

    @Test
    public void testConfirmCancelAlert(){
        AlertPage alertPage = homePage.ClickOnAlert();
        alertPage.clickConfirmCancelBox();
        String resultText = alertPage.getResultText();
        Assert.assertEquals(resultText, "You pressed Cancel!");
    }

    @Test
    public void testPromptAcceptAlert(){
        AlertPage alertPage = homePage.ClickOnAlert();
        alertPage.clickPromptAlert();
        String resultText = alertPage.getResultPromptText();
        Assert.assertEquals(resultText, "You should not have enjoyed learning at I am going to Accept This alert as compared to TestLeaf! Right?");
    }

    @Test
    public void testSweetAlert() {
        AlertPage alertPage = homePage.ClickOnAlert();
        alertPage.clickSweetAlert();
    }
}