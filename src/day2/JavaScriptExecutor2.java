package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		WebElement txtPassword = driver.findElement(By.id("pass"));

// We can able to enter same data for different places like login or password		
//		js.executeAsyncScript("arguments[1].setAttribute('value','Dinesh SDR')",txtEmail,txtPassword);
		
		js.executeAsyncScript("arguments[0].setAttribute('value','Dinesh SDR')",txtEmail);
		
// To get attribute value
		//return.arguments[0].getAttribute('value')
//		Object object1 = js.executeScript("return arguments[0].getAttribute('placeholder')",txtEmail);
		
		Object o1 = js.executeScript("return arguments[0].getAtrribute('placeholder')",txtEmail);
		
		System.out.println("Placeholder:/n"+o1);
		
		String S1 = (String)o1;
		System.err.println(S1);
		
		
		
		
		
	}
	
	
	
}
