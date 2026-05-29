package assignment_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

//Write a programe for fetching currentURL by using selenium 
public class Assiognment220 {

	public static void main(String[] args) {
		  ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.google.com");
	     String url =  driver.getCurrentUrl();
	     System.out.println(url);

	}

}
