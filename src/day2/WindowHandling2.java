package day2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling2 {

	public static void main(String[] args) throws AWTException {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Window");

		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//li[@id='Open New Window']")).click();
		
		Actions A = new Actions(driver);
			
		WebElement Rightclick = driver.findElement(By.className("lazyloaded"));
	
		A.moveToElement(Rightclick).perform();
		
		A.contextClick(Rightclick).perform();
		
		Robot R = new Robot();
		
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
// To Fetch Parent Id alone
		String ParentID = driver.getWindowHandle();
		System.out.println(ParentID);
		
//To Fetch all window
		Set<String> OtherWindowID1 = driver.getWindowHandles();
		System.out.println(OtherWindowID1);
		
//After moved to another window,we also need to move to other window
//This method is not using for Loop
//We have to convert Set to List
		List<String> Li = new ArrayList<String>();
		Li.addAll(OtherWindowID1);
		
		driver.switchTo().window(Li.get(1));		
		
		driver.findElement(By.xpath("(//a[@class='tooltipsy'])[1]")).click();
		
//Not able to go back to the Parent tab and not able to click element		
//		driver.switchTo().window(Li.get(0));		
//
//		driver.findElement(By.className("lazyloaded")).click();

			driver.switchTo().window(Li.get(2));
		
		driver.findElement(By.xpath("(//div[@class='pic_info type2'])[1]")).click();
		
		
		
		
		
	}
	
	
	
}
