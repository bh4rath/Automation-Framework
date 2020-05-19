package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdowPage {

    private WebDriver driver;

    public DropdowPage(WebDriver driver) {
        this.driver = driver;
    }

    private By selectByIndex = By.id("dropdown1");
    private By selectByText = By.name("dropdown2");
    private By selectByValue = By.id("dropdown3");
    private By getAllOptions = By.cssSelector(".dropdown");
    private By selectBySendKey = By.xpath("(//div//select)[5]");


    public void selectByIndex(int index) {
        Select select = new Select(driver.findElement(selectByIndex));
        select.selectByIndex(index);
    }

    public String getSelectedIndex() {
        Select select = new Select(driver.findElement(selectByIndex));
        return select.getFirstSelectedOption().getText();
    }

    public void selectByText(String text) {
        Select select = new Select(driver.findElement(selectByText));
        select.selectByVisibleText(text);
    }

    public String getSelectedText() {
        Select select = new Select(driver.findElement(selectByText));
        return select.getFirstSelectedOption().getText();
    }


    public void selectByValue(String text) {
        Select select = new Select(driver.findElement(selectByValue));
        select.selectByValue(text);
    }

    public String getSelectedValue() {
        Select select = new Select(driver.findElement(selectByValue));
        return select.getFirstSelectedOption().getText();
    }

    public int getAllSelectedOptions() {
        Select select = new Select(driver.findElement(getAllOptions));
        List<WebElement> options = select.getOptions();
        return options.size();
    }

    public void selectBySendKeys(String text) {
        driver.findElement(selectBySendKey).sendKeys(text);
    }

    public String getSelectedSendKeysValue() {
        Select select = new Select(driver.findElement(selectBySendKey));
        return select.getFirstSelectedOption().getText();
    }
}