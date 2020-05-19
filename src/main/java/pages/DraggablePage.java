package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DraggablePage {

    private WebDriver driver;

    public DraggablePage(WebDriver driver) {
        this.driver = driver;
    }

    private By source = By.id("draggable");
    private By destination = By.cssSelector("img[alt='logo Testleaf']");


    public void doDragging() {
        WebElement dragElement = driver.findElement(source);
        WebElement dropElement = driver.findElement(destination);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragElement, dropElement).perform();
    }
}