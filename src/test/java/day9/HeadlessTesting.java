package day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		
		String act_title = driver.getTitle();
		if(act_title.equals("nopCommerce demo store. Home page title")) {
			System.out.println("Test passed.....");
		}else {
			System.out.println("Test failed...");
		}
	}

}
