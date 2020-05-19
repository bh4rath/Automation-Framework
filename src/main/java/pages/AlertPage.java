package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    private WebDriver driver;
    Alert alert;
    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    private By alertBox = By.xpath("//button[text()='Alert Box']");
    private By confirmBox = By.xpath("//button[text()='Confirm Box']");
    private By promptBox = By.xpath("//button[text()='Prompt Box']");
    private By sweetAlert = By.id("btn");
    private By sweetAlertAccept = By.cssSelector(".swal-modal button");
    private By resultConfirmBox = By.id("result");
    private By resultPromptBox = By.id("result1");


    public void clickAlertBox() {
         driver.findElement(alertBox).click();
         alert = driver.switchTo().alert();
         alert.accept();
    }
    public void clickConfirmBox() {
        driver.findElement(confirmBox).click();
        alert = driver.switchTo().alert();
        alert.accept();
    }
    public String getResultText(){
        return driver.findElement(resultConfirmBox).getText();
    }

    public String getResultPromptText(){
        return driver.findElement(resultPromptBox).getText();
    }


    public void clickConfirmCancelBox() {
        driver.findElement(confirmBox).click();
        alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void clickPromptAlert() {
        driver.findElement(promptBox).click();
        alert = driver.switchTo().alert();
        alert.sendKeys("I am going to Accept This alert");
        alert.accept();
    }

    public void clickSweetAlert() {
        driver.findElement(sweetAlert).click();
        driver.findElement(sweetAlertAccept).click();
    }
}