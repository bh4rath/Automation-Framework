package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonPage {

    private WebDriver driver;
    public ButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    By goToHomePage = By.id("home");
    By buttonColor = By.id("color");
    By buttonPosition = By.id("position");
    By buttonSize = By.id("size");

    public HomePage clickGoToHomePageButton(){
        driver.findElement(goToHomePage).click();
        return new HomePage(driver);
    }

    public String getCssValueOfButton(){
        return driver.findElement(buttonColor).getCssValue("background-color");
    }

    public int getButtonXPostion(){
        int xPostion = driver.findElement(buttonPosition).getLocation().getX();
        return xPostion;
    }
    public int getButtonYPosition(){
        int yPostion = driver.findElement(buttonPosition).getLocation().getY();
        return yPostion;
    }

    public int getHeight(){
        return driver.findElement(buttonSize).getSize().getHeight();
    }

    public int getWidth(){
        return driver.findElement(buttonSize).getSize().getWidth();
    }
}