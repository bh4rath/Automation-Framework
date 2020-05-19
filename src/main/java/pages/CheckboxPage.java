package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage {

    private WebDriver driver;
    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickCheckbox(String checkboxValue) {
        driver.findElement(By.xpath("//div[contains(text(),'"+checkboxValue+"')]//input")).click();
    }
}