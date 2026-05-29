package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Write  a script to Drag and Drop a WebElement 
public class Assignment245 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
	
		Thread.sleep(3000);
		WebElement E1=	driver.findElement(By.id("container"));
	
	
	WebElement E2=	driver.findElement(By.id("div2"));

	Actions a1=new Actions(driver);
	a1.dragAndDrop(E1, E2).perform();
	Thread.sleep(3000);
	driver.navigate().refresh();
	



	}

}
