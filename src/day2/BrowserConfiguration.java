package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfiguration {

	public static void main(String[] args) {
// 1.Browser Configuration
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

// 2.Instantiate 
		WebDriver driver = new ChromeDriver();
		
// 3.TO Launch URL
		driver.get("https://www.irctc.co.in/");
		
// 4.To Get the Title
		String title = driver.getTitle();
		System.out.println(title);
		
// 5.To Get Current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
// 6.To Close the current window
		driver.close();
		
// 7.To Quit the entire window
		driver.quit();		
		
		
		
		
		
	}

}
