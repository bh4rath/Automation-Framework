package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DraggablePage;

public class TestDraggable extends BaseTest {

    @Test
    public void testDraggable() {
        DraggablePage draggablePage = homePage.draggable();
        draggablePage.doDragging();
    }
}
