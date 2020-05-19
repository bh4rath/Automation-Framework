package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementAppearPage {

    private WebDriver driver;
    public ElementAppearPage(WebDriver driver) {
        this.driver =driver;
    }

    private By buttonAppear = By.cssSelector("#btn");

    public String waitForElementAppear() {
        Wait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonAppear));
        return driver.findElement(buttonAppear).getText();
    }
}
