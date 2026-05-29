package assignment_selenium;
//Convert your Set into List
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment249 {

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


	// Convert Set into List
			List<String> windows = new ArrayList<String>(ids);

			// Switch to 3rd product window
			driver.switchTo().window(windows.get(3));

			System.out.println("Control moved to 3rd product window");

			System.out.println(driver.getTitle());
	}
	   	   
	}


