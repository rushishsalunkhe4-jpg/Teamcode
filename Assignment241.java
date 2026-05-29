package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//"Write a script for Handling a Drop Down Using Select class Method "selectbyindex "
public class Assignment241 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
    WebElement e1  =  driver.findElement(By.xpath("//select[@id='gender']"));
  //  searchbox.click();
    Select s1 = new Select(e1);
    s1.selectByIndex(2);

	}

}
