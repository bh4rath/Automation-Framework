package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPage {

    private WebDriver driver;
    public EditPage(WebDriver driver) {
        this.driver = driver;
        assert driver.getTitle().contains("TestLeaf - Interact with Edit Fields");
    }

    private By emailID = By.id("email");
    private By append = By.cssSelector("input[value*=\"Append\"]");
    private By testLeaf = By.xpath("//input[@name='username' and @value='TestLeaf']");
    private By clear = By.cssSelector("input[value*=\"Clear me!!\"]");
    private By editField = By.cssSelector("input[disabled*=\"true\"]");

    public void setEamilAddress(String emaillAddress){
        driver.findElement(emailID).sendKeys(emaillAddress);
    }

    public void setAppendText(String appendText){
        driver.findElement(append).sendKeys(appendText);
    }

    public String getTestLeafText(){
        return driver.findElement(testLeaf).getAttribute("value");
    }

    public void clearText(){
        driver.findElement(clear).clear();
    }

    public boolean isBlank(){
        return driver.findElement(clear).getText().isEmpty();
    }

    public String isDisabled(){
        return driver.findElement(editField).getAttribute("disabled");
    }
}
