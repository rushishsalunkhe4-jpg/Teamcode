package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//" Write a script to hoverover the web Element by using Actions class "
public class Assignment244 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	
		Thread.sleep(3000);
		WebElement fresh=	driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));  ////span[text()='Fresh']    span tagname la ase karaycha
	
	Actions a1=new Actions(driver);  //driver warcha ahe
	a1.moveToElement(fresh).perform();
	Thread.sleep(3000);
	
	WebElement e1=	driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
e1.click();

	}

	}


