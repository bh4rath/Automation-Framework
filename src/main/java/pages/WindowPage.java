package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowPage {

    private WebDriver driver;

    public WindowPage(WebDriver driver) {
        this.driver = driver;
    }

    private By window = By.id("home");
    private By multipleWindow = By.cssSelector("button[onclick='openWindows()']");
    private By closeWindow = By.id("color");
    private By waitWindow = By.cssSelector("button[onclick='openWindowsWithWait();']");

    public void clickOpenHomePage() {
        String parentWindow = driver.getWindowHandle();
        driver.findElement(window).click();
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if (parentWindow != window)
                driver.switchTo().window(window);
        }
    }

    public String getNewWindowPageTite(){
        return driver.getTitle();
    }

    public void clickOpenMultipleWindow() {
        driver.findElement(multipleWindow).click();
    }
    public int getNoOfOpenedWindowCount(){
       return driver.getWindowHandles().size();
    }

    public void clickDoNotCloseWindow() {
        driver.findElement(closeWindow).click();
        String parentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if (parentWindow != window)
                driver.switchTo().window(window).close();
        }
    }

    public void clickWaitForWindowToOpen() {
        driver.findElement(waitWindow).click();
        String parentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if (parentWindow != window)
                driver.switchTo().window(window).close();
        }
    }
}