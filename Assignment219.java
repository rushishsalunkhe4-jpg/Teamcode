package assignment_selenium;
//Write a programe for  gettitle method 
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment219 {

	public static void main(String[] args) {
		  ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.google.com");
	     String title =  driver.getTitle();
	     System.out.println(title);
	}

}
