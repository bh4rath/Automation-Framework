package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DroppablePage;

public class TestDroppable extends BaseTest {



    @Test
    public void testDroppable(){
        DroppablePage droppable = homePage.droppable();
        droppable.doDragAndDrop();
    }
}
