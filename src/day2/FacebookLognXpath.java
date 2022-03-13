package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLognXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		

//Syntax to locate the element using Xpath //tagName[attributename = 'attributevalue']
//WebElement txtEmail = driver.findElement(By.xpath("//input[@name = 'email']"));

// Instead of two lines we can reduce as one line				
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("rajudina12.2@gmail.com");
		
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("rajudina12.2@gmail.com");
		
//To hold the same page
		
	Thread.sleep(2000);
//		
//		WebElement clickLogin = driver.findElement(By.xpath("//button[@type = 'submit']"));
//		clickLogin.click();
//		
//To manage the windows maximize
		driver.manage().window().maximize();
		
//To find the locator while the locators is more than one locators
// need to use the syntax //tagname[@attributename = 'attributevlue'])[1] or [2] or based on the needed position
		
		driver.findElement(By.xpath("(//a[@role='button']) [2]")).click();
		

		
		
		
		

		
		
		
	
		
		
		
	}

}
