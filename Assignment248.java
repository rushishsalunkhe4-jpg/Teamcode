package assignment_selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to search  a product and click on the first 5 products after that move the control to 3rd one
public class Assignment248 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	WebElement SearchBox =	driver.findElement(By.id("twotabsearchtextbox"));
	SearchBox.sendKeys("laptop");
	
	WebElement search =	driver.findElement(By.id("nav-search-submit-button"));
	search.click();
	
	Thread.sleep(3000);
   List<WebElement> Product= driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
   
   for(int i=0;i<5;i++)
   {
	   Product.get(i).click();
	   Thread.sleep(2000);

	
	   
	}
	// Get all window ids
	Set<String> ids = driver.getWindowHandles();


// Move control to 3rd window
		Iterator<String> it = ids.iterator();

		String parent = it.next();
		String child1 = it.next();
		String child2 = it.next();
		String child3 = it.next();

		// Switch to 3rd product window
		driver.switchTo().window(child3);

		System.out.println("Control moved to 3rd product window");
		System.out.println(driver.getTitle());
	}
}
	   	   
	     