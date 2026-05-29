package assignment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a script  to fetch all linktext of webpage.use url:-https://www.google.in
public class Assignment235 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.in");
		driver.manage().window().maximize();
		
	List<WebElement>list =	driver.findElements(By.tagName("a"));
	//Thread.sleep(2000);
	
	for(int i=0;i<list.size();i++)
	{
	   WebElement A1= list.get(i);
	String text =   A1.getText();
	System.out.println(text);
	   
	}
  
		
		
	}

}
