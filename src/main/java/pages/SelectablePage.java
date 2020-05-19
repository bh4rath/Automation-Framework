package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectablePage {

    private WebDriver driver;

    public SelectablePage(WebDriver driver) {
        this.driver = driver;
    }

    private By source = By.xpath("//li[contains(text(),'Item 1')]");
    private By destination = By.xpath("//li[contains(text(),'Item 7')]");

    public void selectItems() {
        WebElement sourceElement = driver.findElement(source);
        WebElement destiElement = driver.findElement(destination);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement, destiElement).perform();
    }
}
