package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"navigate this url ""https://www.facebook.com/login by using name loacter automate the fields "
public class Assignment227 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement  username =  driver.findElement(By.name("email"));
		username.sendKeys("rushikeshsal@gmail.com");
		
		Thread.sleep(2000);
		WebElement  password =  driver.findElement(By.name("pass"));
		password.sendKeys("123456");
		
		

	}

}
