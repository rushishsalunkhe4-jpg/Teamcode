package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//How to work on those componnets which are under Iframe or frame?
public class Assignment250 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();

		// Locate frame
		WebElement frame = driver.findElement(By.id("singleframe"));

		// Switch to frame
		driver.switchTo().frame(frame);

		// Perform action inside frame
		driver.findElement(By.xpath("//input[@type='text']"))
		      .sendKeys("Rushikesh");

		System.out.println("Text entered successfully");  
	}

}
