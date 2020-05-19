package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioPage {

    private WebDriver driver;
    public RadioPage(WebDriver driver) {
        this.driver = driver;
    }

    private By checked = By.xpath("//label[@for='Checked']//input");


    public void clickClassesRadio(String radioOption) {
        driver.findElement(By.xpath("//input[@id='"+radioOption+"']")).click();
    }

    public boolean getSelectedradio() {
        return driver.findElement(checked).isSelected();
    }
}
