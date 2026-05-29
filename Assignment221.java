package assignment_selenium;
import java.util.Set;

//" Write a programe for getWindowHandle and getWindowHandles method"
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment221 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		String window = driver.getWindowHandle();
		System.out.println(window);
		Set<String> window1 = driver.getWindowHandles();
		System.out.println(window1);
	}

}
