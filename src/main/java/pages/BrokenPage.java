package pages;

import org.openqa.selenium.WebDriver;

public class BrokenPage {

    private WebDriver driver;
    public BrokenPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle(){
        return driver.getTitle();
    }
}
