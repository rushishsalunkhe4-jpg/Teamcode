package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;

//Write a script Login to facebook with Xpath
public class Assignment238 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		driver.manage().window().maximize();
		
	WebElement email =	driver.findElement(By.xpath("//input[@name='email']"));
	email.sendKeys("rushi8@gmail.com");
	
	WebElement password =	driver.findElement(By.xpath("//input[@name='pass']"));
	password.sendKeys("Rushi123");
		
		
	}

}
