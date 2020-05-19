package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseTest {
	public static WebDriver driver;
	protected HomePage homePage;
	private static final String APP_URL = "http://www.leafground.com/";

	@BeforeMethod
	public void launchApplication	() {
		setChromeDriverProperty();
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
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Backup\\eclipse-workspace\\automation\\Resources\\chromedriver.exe");
	}
}