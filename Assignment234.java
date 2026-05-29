package assignment_selenium;
//Write a script automate webelement using findElements.
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment234 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		
    	Thread.sleep(4000);
        List<WebElement> textbox = driver.findElements(By.tagName("input"));    //tagname locator
        
        for(int i=0 ; i<textbox.size();i++)
        {
        	System.out.println(i);
        }

       textbox.get(1).sendKeys("Rushikesh");
       
       textbox.get(2).sendKeys("Salunkhe");
       
       textbox.get(3).sendKeys("rushikeshsal@gmail.com");
       
       textbox.get(4).sendKeys("9856243568");
       
    
    	
	}

}
