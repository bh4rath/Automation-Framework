package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FramePage {

    private WebDriver driver;

    public FramePage(WebDriver driver) {
        this.driver = driver;
    }

    private By frame = By.cssSelector("iframe[src='default.html']");
    private By frameClick = By.id("Click");
    private By nestedFrameClick = By.id("Click1");

    public void clickInsideFrame()  {
        WebElement element = driver.findElement(frame);
        driver.switchTo().frame(element);
        driver.findElement(frameClick).click();
    }

    public String getFrameButtonText() {
        return driver.findElement(frameClick).getText();
    }

    public void clickInsideNestedFrame() {
        driver.switchTo().frame(1);
        driver.switchTo().frame(0);
        driver.findElement(nestedFrameClick).click();
    }

    public String getNestedFrameButtonText() {
        return driver.findElement(nestedFrameClick).getText();
    }

    public int getTotalNoOfFrames() {
        List<WebElement> totalNoOfFrames = driver.findElements(By.tagName("iframe"));
        return totalNoOfFrames.size();
    }
}