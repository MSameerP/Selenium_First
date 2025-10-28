package day3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) {
//		
		WebDriver driver = new ChromeDriver();
		
		//get() -- opens page in browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// getTitle() -- returns title of the page
		System.out.println(driver.getTitle());
		
		//getCurrentTitle() -- returns current url
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource -- returns pagesource
		// System.out.println(driver.getPageSource());
		
		//get windowhandle of the page
		System.out.println("Window id "+driver.getWindowHandle());
		
		//getwindowhandles() returns multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> wh=driver.getWindowHandles();
		
		for(String st:wh) {
			System.out.println("multiple windows: "+st);
		}
		
	}

}
