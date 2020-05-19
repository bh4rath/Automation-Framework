package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;



/**
 * @author Bharath Selvam
 *
 */
public class BaseTest {
	public static WebDriver driver;
	protected HomePage homePage;
	private static final String APP_URL = "http://www.leafground.com/";

	@BeforeMethod
	public void launchApplication	() {
		setChromeDriverProperty();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(APP_URL);
		homePage = new HomePage(driver);
	}
	
	@AfterMethod
	public void quitDriver() {
		driver.quit();
	}
	 
	private static void setChromeDriverProperty() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	}
}