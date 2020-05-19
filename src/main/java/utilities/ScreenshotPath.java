package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotPath {

    public static String getScreenshotPath(String TestCaseName, WebDriver driver) throws IOException {
        TakesScreenshot takeScreenshot = ((TakesScreenshot) driver);
        File srcFile = takeScreenshot.getScreenshotAs(OutputType.FILE);
        String destFile = System.getProperty("user.dir")+"\\reports\\" + TestCaseName + ".png";        
        File file = new File(destFile);
        FileUtils.copyFile(srcFile, file);
        return destFile;
    }
}