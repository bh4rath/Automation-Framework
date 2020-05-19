package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SortablePage {

    private WebDriver driver;
    public SortablePage(WebDriver driver) {
        this.driver = driver;
    }

    private By source = By.xpath("//li[(text()='Item 1')]");
    private By destination = By.xpath("//li[(text()='Item 5')]");

    public void sortAllItems() {
        WebElement sourceElement = driver.findElement(source);
        WebElement destiElement = driver.findElement(destination);
        Actions actions = new Actions(driver);
        actions.clickAndHold().dragAndDrop(sourceElement, destiElement).build().perform();
        actions.clickAndHold().dragAndDrop(sourceElement, destiElement).build().perform();
    }
}