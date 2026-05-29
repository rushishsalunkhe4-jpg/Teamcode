package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://skookai.com/dashboard");
		driver.manage().window().maximize();
		
	WebElement button =	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/button/span[1]"));
	

	}

}
