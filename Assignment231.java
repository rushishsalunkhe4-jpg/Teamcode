package assignment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*"Write a Script  to automate 
https://grotechminds.com/registeration-form/
using id,name ,tagname,linkText,partialLinktext locater
note:-Dont automate gender,state,checkbox and Register"
*/
public class Assignment231 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
    	WebElement firstname =	driver.findElement(By.id("firstName"));    //id locator
    	firstname.sendKeys("Rushikesh");
    	
        WebElement lastname = 	driver.findElement(By.name("lastName"));     //name locator
        lastname.sendKeys("salunkhe");

    	Thread.sleep(3000);
        List<WebElement> textbox = driver.findElements(By.tagName("input"));    //tagname locator
        System.out.println(textbox.size());
        
    	Thread.sleep(3000);
        WebElement link = 	driver.findElement(By.linkText("Home"));     //linkText locator
        link.click();
        
    	Thread.sleep(3000);
        WebElement link2 = 	driver.findElement(By.partialLinkText("Corner"));     //partialLinkText locator
        link2.click();
        
        /*partialLinkText() मध्ये पूर्ण नाव लिहायची गरज नसते.
         त्या link मधला काही भाग दिला तरी Selenium त्या link ला शोधतो. 
         * */      
        }

}
