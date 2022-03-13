package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://demo.guru99.com/test/guru99home/\r\n");

	driver.manage().window().maximize();

//	Swithcinto Frame by using Id & name
	
//Need to switch into the frame before finding the webelement
//driver.switchTo().frame(String id); or (String name) or (int index)	
//	driver.switchTo().frame("a077aa5e");
//	
////Do not select the element in frame block, need to get after frame	
//	driver.findElement(By.xpath("(//a[@href='http://www.guru99.com/live-selenium-project.html'])")).click();	
//		
//	Swithcinto Frame by using WebElement --- 
    
	WebElement We = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
	driver.switchTo().frame(We);

	driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
//	
// Switchinto frame by using Index Position
	
//	driver.switchTo().frame(2);
//	driver.findElement(By.xpath("(//a[@href='http://www.guru99.com/live-selenium-project.html'])")).click();	
//
//	
	
	
	
	
	
	
	
	
	
	
	}

}
