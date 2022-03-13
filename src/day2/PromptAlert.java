package day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//a[contains(text(),'Textbox ')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'demonstrate ')]")).click();
		
		
		Alert PA = driver.switchTo().alert();
		
		PA.sendKeys("SDR");
		
		//Type 1 --- Accept 
		PA.accept();
		
		//Type 2 --- Dismiss
//		PA.dismiss();
		
		
		
		
		
	}
}
