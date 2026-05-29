package assignment_selenium;
//Write a script to automate "https://www.amazon.in") using Relative xpath 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment239 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	WebElement search =	driver.findElement(By.xpath("//input[@name='field-keywords']"));
	search.sendKeys("HeadPhone");
	
	Thread.sleep(3000);
	
	WebElement button =	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	button.click();
		
		
	}

	}


