package assignment_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment216_LaunchBrowser {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();   //launch chrome browser
	//	EdgeDriver driver2 = new EdgeDriver();      //launch Edge browser
   //	FirefoxDriver driver3 = new FirefoxDriver(); //launch Firefox browser
		
		driver.get("https://www.amazon.in");

	}

}
