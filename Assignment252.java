package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//"Incognito Mode Maximised manner from starting Headless Mode Change the Language of the given website using selenium"
public class Assignment252 {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
	//	options.addArguments("headless");
		options.addArguments("incognito");
		//options.addArguments("lang=ar");
		ChromeDriver driver=new ChromeDriver(options);	
		driver.get("https://www.google.in");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.id("APjFqb"));
		e1.sendKeys("India Country");

	}

}
