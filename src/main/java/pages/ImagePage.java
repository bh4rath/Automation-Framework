package pages;

import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class ImagePage {

    private WebDriver driver;

    public ImagePage(WebDriver driver) {
        this.driver = driver;
    }

    private By homeImage = By.xpath("//img[contains(@src,'home.png')]");
    private By brokenImage = By.xpath("//img[contains(@src,'abcd.jpg')]");
    public HomePage clickImage() {
        driver.findElement(homeImage).click();
        return new HomePage(driver);
    }

    public int clickBrokenImage() throws MalformedURLException {
        int responseCode = 0;
        List<String> imgs = new ArrayList<String>();
        List<WebElement> elements = driver.findElements(brokenImage);
        for (WebElement element : elements) {
            imgs.add(element.getAttribute("src"));
        }
        for (String img : imgs) {
            responseCode = returnStatusCode(new URL(img));
        }
        return responseCode;
    }

    public int returnStatusCode(URL url) {
        Response response = given().
                when().
                get(url);
        return response.getStatusCode();
    }
}