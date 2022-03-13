package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyAttribute {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
//To find the attribute value 
// WebElement.getAttribute();
		
		WebElement TxtEmail = driver.findElement(By.id("email"));
		TxtEmail.sendKeys("rajudina12.2@gmail.com");
		
		String S1 = TxtEmail.getAttribute("name");
		System.out.println(S1);
		
		String S2 = TxtEmail.getAttribute("placeholder");
		System.out.println(S2);
		
		String S3 = TxtEmail.getAttribute("value");
		System.out.println(S3);
		
		
		
		
		
		
		
		
		
		
		
	}
}
