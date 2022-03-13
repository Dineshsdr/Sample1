package day3;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {

	public class WebTable1 {
		public void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

//			driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			driver.manage().window().maximize();
//To Fetch al data from all rows without heading using For loop			
			WebElement tables = driver.findElement(By.xpath("//table[@id='customers']"));
			
			List<WebElement> allRows = tables.findElements(By.tagName("tr"));
			
			for (int i = 0; i < allRows.size(); i++) {
				
				WebElement row = allRows.get(i);
				
				List<WebElement> alldata1 = row.findElements(By.tagName("td"));
				
				for (int j = 0; j < alldata1.size(); j++) {
					
					WebElement data1 = alldata1.get(j);
					System.out.println(data1.getText());
				}
				
				
			}

		}
	}
}