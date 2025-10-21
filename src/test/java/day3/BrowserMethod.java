package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethod {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		// close() -> closes the single window in browser
		driver.close();
		
		//quit()-> closes all the windows
		driver.quit();
	}

}
