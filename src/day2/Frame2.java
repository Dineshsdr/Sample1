package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/frame");

		driver.manage().window().maximize();
		
//		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
//		
//		int tagname = elements.size();
//		System.out.println(tagname);
				
		driver.switchTo().frame("firstFr");
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("SDR");
		
		driver.findElement(By.name("lname")).sendKeys("eses");

// This step is for move to the next frame, since email is from another frame(child frame)		
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rafe");
// To go back to the previous frame 
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).sendKeys("SDR");
// To find other elements since that is not from the same frame, need to get out of the whole frame
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@class='card-footer-item']")).click();
		
	}
	
}
