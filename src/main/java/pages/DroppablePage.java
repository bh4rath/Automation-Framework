package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DroppablePage {

    private WebDriver driver;

    public DroppablePage(WebDriver driver) {
        this.driver = driver;
    }

    private By drag = By.id("draggable");
    private By drop = By.id("droppable");

    public void doDragAndDrop() {
        WebElement source = driver.findElement(drag);
        WebElement destination = driver.findElement(drop);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, destination).perform();
    }
}
