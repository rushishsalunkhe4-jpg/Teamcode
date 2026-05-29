package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a programe to lunch the browser and navigate https://www.amazon.in url and locate the webelement usi
public class Assignment226 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		   WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));

	        searchbox.sendKeys("Shoes");
	}

}
