package day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

//1.Simple alert
		
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		
		driver.findElement(By.xpath("(//button[contains(text(),'button')])[1]")).click();
		
// To handle simple alert
		
	Alert Simplealert = driver.switchTo().alert();
		
	String A = Simplealert.getText();
	System.out.println(A);
	
	Simplealert.accept();
		
		
	}
}
