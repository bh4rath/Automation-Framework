package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HyperLinkPage {
    private WebDriver driver;

    public HyperLinkPage(WebDriver driver) {
        this.driver = driver;
    }

    private By goToHomePage = By.xpath("(//a[text()='Go to Home Page'])[1]");
    private By getLinkHref = By.xpath("//a[@href='Button.html']");
    private By brokenLink = By.xpath("//a[text()='Verify am I broken?']");

    public HomePage clickGoToHomePage(){
        driver.findElement(goToHomePage).click();
        return new HomePage(driver);
    }

    public String getGoToLinkPageTitle(){
        return driver.findElement(getLinkHref).getAttribute("href");
    }

    public BrokenPage clickGoToBrokenPage(){
        driver.findElement(brokenLink).click();
        return new BrokenPage(driver);
    }

    public List<WebElement> getTotalHyperLinks(){
        return driver.findElements(By.tagName("a"));
    }



}
