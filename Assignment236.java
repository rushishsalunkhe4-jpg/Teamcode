package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a script for isDisplayed,isEnabled,isSelected method .
public class Assignment236 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rushikesh/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	WebElement u =	driver.findElement(By.id("1"));
	if(u.isDisplayed()&& u.isEnabled())
	{
		u.sendKeys("rushikesh4");
	}
	else
	{
		System.out.println("cant perform action");
	}
	
	WebElement baby =	driver.findElement(By.id("321"));
	if(baby.isSelected())
	{
		System.out.println("");
	}
	else
	{
	baby.click();
	}
	

	}

}
