package day8;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_window {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.opencart.com");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://orangehrm.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://orangehrm.com");
		
		
		
	}

}
