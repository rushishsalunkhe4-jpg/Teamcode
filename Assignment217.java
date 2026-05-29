package assignment_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

//Write a programe to launch browser and navigate this url ("https://www.google.com") using 'get' method
public class Assignment217 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
