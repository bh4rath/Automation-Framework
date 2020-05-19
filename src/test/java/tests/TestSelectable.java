package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SelectablePage;

public class TestSelectable extends BaseTest {

    @Test
    public void testSelectable(){
        SelectablePage selectablePage = homePage.clickSelect();
        selectablePage.selectItems();
    }
}
