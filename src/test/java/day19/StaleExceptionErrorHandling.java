package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleExceptionErrorHandling {
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		 driver.manage().window().maximize();
		 
		 //locate the start button
		 WebElement start =  driver.findElement(By.xpath("//div[@id=\"start\"]/button"));
		 
		 //refreshing the page
		driver.navigate().refresh();
		 
		 try {
			Thread.sleep(3000);
			 start.click();
			 
			 driver.quit();
		} catch (Exception e) {
			
			System.out.println("Stale Exception Error has been caught");
			WebElement start2 =  driver.findElement(By.xpath("//div[@id=\"start\"]/button"));
			start2.click();
			
			driver.quit();
		}
		 
		
		
	}

}
