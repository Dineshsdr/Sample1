package day3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealIssue {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("pushDenied")).click();

		String S1 = driver.getTitle();
		System.out.println(S1);

		driver.findElement(By.className("keyword")).sendKeys("PS4 Games");

//		// For going down
//
//		Robot R = new Robot();

//		// 6 times---down---1time click
//
//		for (int i = 0; i < 6; i++) {
//
//			R.keyPress(KeyEvent.VK_DOWN);
//			R.keyRelease(KeyEvent.VK_DOWN);
//		}
//
//		R.keyPress(KeyEvent.VK_ENTER);
//		R.keyRelease(KeyEvent.VK_ENTER);
		
//		driver.findElement(By.xpath("//span[text()='Search']")).click();

		driver.findElement(By.xpath("//span[@class = 'searchTextSpan']")).click();
		
		Thread.sleep(2000);

		//span[text()='Search']	
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("613004");
		
//		input[@type='text'][@placeholder='Enter your pincode']
//
	}
	
}
