package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

// Downcasting
// child var = (child)par-ref
// to use javascript need to create below method like object creation we need to write manually
//If SendKeys not working means need to use this
		JavascriptExecutor JS = (JavascriptExecutor) driver;

		WebElement JS1 = driver.findElement(By.id("email"));

		// Step1: arguments[0].setAttribute('value',value which we want to enter(anything)')

		JS.executeScript("arguments[0].setAttribute('value','rajudina12.2@gmail.com')", JS1);

		WebElement JS2 = driver.findElement(By.id("pass"));

		JS.executeScript("arguments[0].setAttribute('value','123@123')", JS2);
//To Click the button 
		
		WebElement JS3 = driver.findElement(By.name("login"));
		
		JS.executeScript("arguments[0].click()",JS3);
		
		
		
	}

	
}
