package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a programe to lunch the browser and navigate https://www.amazon.in url and 
//locate the webelement using id ,method and perform opertion using Keys.ENTER
public class Assignment225 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
	     WebElement searchbox =	 driver.findElement(By.id("twotabsearchtextbox"));
	     searchbox.sendKeys("Shoes"+Keys.ENTER);
	}

}
