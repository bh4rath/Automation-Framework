package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RadioPage;

public class TestRadioButtons extends BaseTest {

    @Test
    public void testClickRadioButton(){
        RadioPage radioPage = homePage.clickRadio();
        radioPage.clickClassesRadio("yes");
    }

    @Test
    public void testSelectedRadioButton(){
        RadioPage radioPage = homePage.clickRadio();
        boolean result = radioPage.getSelectedradio();
        Assert.assertTrue(result);

    }
}