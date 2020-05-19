package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SortablePage;

public class TestSortable extends BaseTest {

    @Test
    public void testSelectable() {
        SortablePage sortablePage = homePage.clickSortable();
        sortablePage.sortAllItems();
    }
}
