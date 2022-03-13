package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMovetoElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium Home Practise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");

		driver.manage().window().maximize();

		// to perform mouse related operations need to use Actions class

		Actions AC = new Actions(driver);

		WebElement Courses = driver.findElement(By.className("header-browse-greens"));

		Thread.sleep(300);

		AC.moveToElement(Courses).perform();

		WebElement Programmingcourse = driver.findElement(By.xpath("//span[text()='Programming (9)']"));

		AC.moveToElement(Programmingcourse).perform();

		WebElement ProgCourse2 = driver
				.findElement(By.xpath("(//a[@href='http://www.greenstechnologys.com/courses.html'])[10]"));

		AC.moveToElement(ProgCourse2).perform();

		ProgCourse2.click();

	}

}
