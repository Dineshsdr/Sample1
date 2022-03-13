package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrwoserConfiguation3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");
//instanciate
		WebDriver driver = new ChromeDriver();
//to enter the URL		
		driver.get("https://www.facebook.com/");
//to get the title of the page		
		String GetTitle = driver.getTitle();
		System.out.println(GetTitle);
		
//to find the element byusing the id or other locators		
		WebElement txtEmail = driver.findElement(By.id("email"));
		
//to send the data to particular field		
		txtEmail.sendKeys("rajudina12.2@gmail.com");	
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("tytuyu212");

//to click the button		
		WebElement txtButton = driver.findElement(By.name("login"));
		txtButton.click();
		
	
		
		
	}

}
