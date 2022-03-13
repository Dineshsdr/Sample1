package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames3 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.softwaretestinghelp.com/");

		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//svg[@class='tcb-icon']"));
		
//      Finding all iframe tags on a web page
		List <WebElement> elements = driver.findElements(By.tagName("iframe"));
		int numberOfTags = elements.size();
		System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
		
//		 Switch to the frame using the frame id
//		 System.out.println("Switching to the frame");
		 driver.switchTo().frame("aswift_0");
		
		
		

	}
}