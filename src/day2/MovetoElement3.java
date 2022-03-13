package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement3 {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();

		Actions A = new Actions(driver);

		driver.findElement(By.id("pushDenied")).click();

		String S1 = driver.getTitle();
		System.out.println(S1);

		driver.findElement(By.xpath("(//span[@class = 'catText'])[2]")).click();
		
		WebElement Heels = driver.findElement(By.xpath("//span[contains(text(),'Heels')]"));
		A.moveToElement(Heels).perform();
		Heels.click();
//		
//		WebElement Pincode = driver.findElement(By.xpath("//div[@class='pincode-serviceability-check']"));
//		A.moveToElement(Pincode);
//		Pincode.sendKeys("613004");
		
		
		driver.findElement(By.id("inputValEnter")).sendKeys("Do Bhai Black Wedges Heels");
		
//		driver.findElement(By.className("keyword")).sendKeys("");
		
//		driver.findElement(By.className("//span[@class='searchTextSpan']"))
		driver.findElement(By.className("searchTextSpan")).click();
		
		
		
		
		
		
		
	}
}
