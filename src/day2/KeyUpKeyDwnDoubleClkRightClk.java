package day2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpKeyDwnDoubleClkRightClk {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		Actions A = new Actions(driver);

		WebElement txtid = driver.findElement(By.xpath("(//input[@type='text'])[2]"));

		A.sendKeys("9790643813").perform();

		A.doubleClick(txtid).perform();

		A.contextClick(txtid).perform();

		Robot R = new Robot();

		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);

		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);

		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);

		R.keyPress(KeyEvent.VK_TAB);
		R.keyRelease(KeyEvent.VK_TAB);

		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);

		driver.findElement(By.xpath("(//span[contains(text(),'Login')])[2]")).click();

	}

}
