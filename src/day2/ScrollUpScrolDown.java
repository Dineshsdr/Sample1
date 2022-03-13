package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpScrolDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");

		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//arguments[0].scrollIntoView(true) - true means scrolldown		
		
		WebElement Scrolldwn = driver.findElement(By.xpath("//button[@class='showmore']"));
		js.executeScript("arguments[0].scrollIntoView(true)",Scrolldwn);

		Thread.sleep(2000);
		
//arguments[0].scrollIntoView(false) - false means scrollup
		WebElement Scrollup = driver.findElement(By.xpath("//img[@src='images/logo.png']"));
		js.executeScript("arguments[0].scrollIntoView(false)",Scrollup);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
