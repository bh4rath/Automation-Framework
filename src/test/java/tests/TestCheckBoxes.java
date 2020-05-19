package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CheckboxPage;

public class TestCheckBoxes extends BaseTest {

    @Test
    public void testSelectCheckbox() {
        CheckboxPage checkboxPage = homePage.clickCheckbox();
        checkboxPage.clickCheckbox("Java");
    }
}
