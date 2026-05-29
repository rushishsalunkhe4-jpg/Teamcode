package assignment_selenium;
// Write a programe to laucnh Amazona  and click on mobiles
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment229 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
    	WebElement text  =	driver.findElement(By.linkText("Mobiles"));
	    text.click();
		
	}

}
