package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium Home Practise\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

	driver.manage().window().maximize();
	
//To Find no.of tables in webpage -- First need to found the table name in DOM 
	List<WebElement> noofTable = driver.findElements(By.tagName("table"));
	System.out.println("No oF Tables in Web Page:"+ noofTable.size());
	
//To Fetch the Single data (2)
//	WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
//	List<WebElement> allrows = table.findElements(By.tagName("tr"));
//	// to locate particular position
//	WebElement row = allrows.get(2);
//	
//	List<WebElement> alldata = row.findElements(By.tagName("td"));
//	WebElement data = alldata.get(1);
//	
//	String t1 = data.getText();
//	System.out.println(t1);
//	
//2.1 Another method to get data
//	WebElement datas = driver.findElement(By.xpath("//td[normalize-space()='Helen Bennett']"));
//	
//	System.out.println(datas.getText());
	
//To fetch all data of particular row
	WebElement table1 = driver.findElement(By.xpath("//table[@id='customers']"));
	
	List<WebElement> rows2 = driver.findElements(By.tagName("tr"));

	WebElement Fullrow = rows2.get(4);
	
	List<WebElement> data2 = Fullrow.findElements(By.tagName("td"));
	
	for (int i = 0; i < data2.size(); i++) {
		
		WebElement data3 = data2.get(i);
		System.out.println(data3.getText());
		
	}
	
	
	
}
}
