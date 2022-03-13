package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNdDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();

		Actions A = new Actions(driver);

		WebElement s1 = driver.findElement(By.id("fourth"));
		
		WebElement a1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Thread.sleep(2000);
		
		A.dragAndDrop(s1, a1).perform();
		
		WebElement s2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		WebElement a2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

		Thread.sleep(2000);

		A.dragAndDrop(s2, a2).perform();
		
		WebElement s3 = driver.findElement(By.xpath("//li[@id='credit2']"));
		
		WebElement a4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Thread.sleep(2000);

		A.dragAndDrop(s3, a4).perform();
		
		WebElement s4 = driver.findElement(By.id("fourth"));

		//Need to count the index number from where we are going to enter the data staring from 1,2,3
		WebElement a5 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Thread.sleep(2000);

		A.dragAndDrop(s4, a5).perform();
		
		

		
		
		
		
		
		
		
		
	}
}
