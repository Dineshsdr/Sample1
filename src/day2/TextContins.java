package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextContins {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
//To get the content from page by using the "text contains"
// SYntax --- //tagname[contains(text(),'partial text')]
		
		WebElement ContainsTxt = driver.findElement(By.xpath("//h2[contains(text(),'connect')]"));
		
		String C1 = ContainsTxt.getText();
		System.out.println(C1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
