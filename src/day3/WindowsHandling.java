package day3;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws AWTException, InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();
				
		driver.findElement(By.id("pushDenied")).click();
		
		driver.findElement(By.className("keyword")).sendKeys("PS4 Watch Dog 2 ( PS4 )\r\n");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		
		
		driver.findElement(By.xpath("//img[@title='WWE 2K18 (PS4) ( PS4 )']")).click();

		

	}

}
