package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/nget/train-search");

		driver.manage().window().maximize();
	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@style='position: absolute; width: 38px; top: -4px; right: -9px;']")).click();
		
		
		
		
	}

}
