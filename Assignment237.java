package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"WAP to enter the email id here with absolute X apth
//https://www.amazon.in/business/register/org/landing?ref_=ab_reg_signin_unifiedauth"
public class Assignment237 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/business/register/org/landing?ref_=ab_reg_signin_unifiedauth");
		driver.manage().window().maximize();
	
	WebElement	email = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div[1]/div/div/form/fieldset/input"));
	email.sendKeys("rushikesh4@gmail.com");
	}

}
