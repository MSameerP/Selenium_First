package day19;

import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchSessionExcept {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		try {
			//navigate
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
			String title = driver.getTitle();
			System.out.println("Title of the page is: "+title);
			
			//simulate the session issue by quitting the driver 
			driver.quit();
			
			//trying to perform another action
			driver.get("https://www.youtube.com");
			
		} catch (NoSuchSessionException e) {
			System.out.println("No such exception caught....");
			driver = new ChromeDriver();
			
			driver.get("https://www.youtube.com");
			driver.manage().window().maximize();
			
			String title = driver.getTitle();
			System.out.println("Title of the page is: "+title);
		}
		finally {
			if(driver!=null) {
				driver.quit();
			}
		}
		
		
		
	}

}
