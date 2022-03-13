package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextIdentify {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		// This method is used while there is no easy locators, we can use this
		// Text(black color) to identify element location
		// //tagname[text()='textvalue']

		// driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//
		// driver.manage().window().maximize();

		WebElement Findpara = driver.findElement(By.xpath("//h2[@class='_8eso']"));

		String P1 = Findpara.getText();
		System.out.println(P1);

	}

}
