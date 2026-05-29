package assignment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a script to automate give url https://grotechminds.com/payments/
public class Assignment232 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/payments/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
    	WebElement cardN =	driver.findElement(By.id("cardNumber"));    //id locator
    	cardN.sendKeys("425639852478");
    	
        WebElement cvN = 	driver.findElement(By.name("cvv"));     //name locator
        cvN.sendKeys("487");

    	Thread.sleep(3000);
        List<WebElement> link = driver.findElements(By.tagName("a"));    //tagname locator
        System.out.println(link.size());
       
        
    	Thread.sleep(3000);
        WebElement link4 = 	driver.findElement(By.linkText("Courses"));     //linkText locator
        link4.click();
        
    	Thread.sleep(3000);
        WebElement link6 = 	driver.findElement(By.partialLinkText("Us"));     //partialLinkText locator
        link6.click();

	}

}
