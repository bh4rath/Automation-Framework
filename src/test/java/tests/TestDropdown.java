package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdowPage;

public class TestDropdown extends BaseTest {

    @Test
    public void testSelectDropdownByIndex(){
        DropdowPage dropdowPage = homePage.ClickOnDropdown();
        dropdowPage.selectByIndex(2);
        String selectedIndexValue = dropdowPage.getSelectedIndex();
        Assert.assertEquals(selectedIndexValue, "Appium");
    }

    @Test
    public void testSelectDropdownByText(){
        DropdowPage dropdowPage = homePage.ClickOnDropdown();
        dropdowPage.selectByText("Loadrunner");
        String selectedTextvalue = dropdowPage.getSelectedText();
        Assert.assertEquals(selectedTextvalue, "Loadrunner");
    }

    @Test
    public void testSelectDropdownByValue(){
        DropdowPage dropdowPage = homePage.ClickOnDropdown();
        dropdowPage.selectByValue("3");
        String selectedTextvalue = dropdowPage.getSelectedValue();
        Assert.assertEquals(selectedTextvalue, "UFT/QTP");
    }

    @Test
    public void testGetNumberOfDropdownOptions(){
        DropdowPage dropdowPage = homePage.ClickOnDropdown();
        int actualOptionsCount = dropdowPage.getAllSelectedOptions();
        Assert.assertEquals(actualOptionsCount, 5);
    }

    @Test
    public void testSelectDropdownBySendKeys(){
        DropdowPage dropdowPage = homePage.ClickOnDropdown();
        dropdowPage.selectBySendKeys("Selenium");
        String selectedTextvalue = dropdowPage.getSelectedSendKeysValue();
        Assert.assertEquals(selectedTextvalue, "Selenium");
    }
}