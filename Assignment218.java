package assignment_selenium;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a programe to launch browser and use close and quit driver method
public class Assignment218 {

	public static void main(String[] args) {
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.google.com");
       driver.get("https://www.amazon.in");
      driver.close();
  
      driver.quit();

	}

}
