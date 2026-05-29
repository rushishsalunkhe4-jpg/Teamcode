package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Write a script to perform double click and right click on  Webelement 
public class Assignment247 {

	public static void main(String[] args) throws InterruptedException{
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		
		WebElement firstName=	driver.findElement(By.id("firstName"));
		firstName.sendKeys("Rushikesh");
		
		Thread.sleep(3000);
		
         Actions a1=new Actions(driver);
         a1.doubleClick(firstName).perform();
         
         firstName.sendKeys(Keys.CONTROL+"C");
         
         WebElement lastname=	driver.findElement(By.id("lastName"));
         lastname.sendKeys(Keys.CONTROL+"V");
         
     	WebElement gmail=	driver.findElement(By.id("email"));
         a1.contextClick(gmail).perform();
         
	}

}
