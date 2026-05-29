package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Write a progrmar to Launch Google and click on Gmail
public class Assignment228 {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	WebElement text  =	driver.findElement(By.linkText("Gmail"));
	text.click();
		

	}

}
