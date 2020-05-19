package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramePage;

public class TestFrames extends BaseTest {

    @Test
    public void testInsideFrame() {
        FramePage framePage = homePage.ClickOnFrames();
        framePage.clickInsideFrame();
        String actualFrameText = framePage.getFrameButtonText();
        Assert.assertEquals(actualFrameText, "Hurray! You Clicked Me.");
    }

    @Test
    public void testInsideNestedFrame() {
        FramePage framePage = homePage.ClickOnFrames();
        framePage.clickInsideNestedFrame();
        String actualNestedFrameText = framePage.getNestedFrameButtonText();
        Assert.assertEquals(actualNestedFrameText, "Hurray! You Clicked Me.");
    }

    @Test
    public void testTotalNoOfFrames(){
        FramePage framePage = homePage.ClickOnFrames();
        int totalFrames = framePage.getTotalNoOfFrames();
        Assert.assertEquals(totalFrames, 3);
    }
}