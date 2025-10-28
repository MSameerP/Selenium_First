package day3;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//navigate.to
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//navigate back
		driver.navigate().back();
		System.out.println("Previous URL is: "+driver.getCurrentUrl());
		
		//navigate refresh
		driver.navigate().refresh();
		
		//navigate forward
		driver.navigate().forward();
		
		
		
		
	}

}
