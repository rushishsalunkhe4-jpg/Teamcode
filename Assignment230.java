package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Write a progrmae laucnh Amazon  and click on Customer Service"
public class Assignment230 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
    	WebElement text  =	driver.findElement(By.partialLinkText("Service"));
	    text.click();

	}

}
