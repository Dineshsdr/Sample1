package day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Home Practise\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
// Downcasting 
//Child var = (child)par-ref;		
		TakesScreenshot tks = (TakesScreenshot) driver;
		
//Take a Screenshot method
		File scs = tks.getScreenshotAs(OutputType.FILE);
		
//Create a new file (destination)		
		File f = new File("D:\\Selenium Home Practise\\Screenshot");
		
//*copy file* content from default file to destination file
		FileUtils.copyFile(scs, f);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
