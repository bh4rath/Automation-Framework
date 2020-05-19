package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementDisappearPage {

    private WebDriver driver;
    public ElementDisappearPage(WebDriver driver) {
        this.driver = driver;
    }

    private By buttonAppear = By.cssSelector("#btn");
    private By strongText = By.cssSelector("strong");


    public void waitForElementToDisappear() {
        Wait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(buttonAppear));
    }

    public String getText(){
        return driver.findElement(strongText).getText().trim();
    }


}
