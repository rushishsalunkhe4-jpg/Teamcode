package assignment_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

//Write a programe for maximize the window
public class Assignment222 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();

	}

}
