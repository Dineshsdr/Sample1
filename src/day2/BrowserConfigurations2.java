package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfigurations2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		String t1 = driver.getTitle();
		System.out.println(t1);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
		
	}

}
