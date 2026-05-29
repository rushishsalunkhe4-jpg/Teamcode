package assignment_selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Selenium13.AmazonClickOnMobile;

//"Assignment for Iframe:Amazon:Searching->Add it to Cart->go to the payment sheet->Credit card option[Almost impossibe 4 u]
//->Enter the Card details[Present inside an Iframe]"
public class Assignment251 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement SearchBox =	driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("laptop");
		
		WebElement search =	driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		
		Thread.sleep(5000);
		List<WebElement> e2 =	driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		e2.get(2).click();
		 
		Set<String> ids=driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(ids);

		// Switch to child window
		driver.switchTo().window(windows.get(1));
		
		Thread.sleep(6000);
	   driver.findElement(By.id("add-to-cart-button")).click();
		System.out.println("Product added to cart");
		
        //payment
		driver.findElement(By.name("proceedToRetailCheckout"))
	      .click();
		
		//login
		driver.findElement(By.id("ap_email_login")).sendKeys("9021478002");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rushi@1997");
		driver.findElement(By.id("signInSubmit")).click();
		
		//Thread.sleep(3000);
		//driver.findElement(By.name("ppw-instrumentRowSelection")).click();
	
	
	}

}
