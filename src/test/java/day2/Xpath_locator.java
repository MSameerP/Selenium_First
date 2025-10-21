package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_locator {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//relative x path with single attribute
		driver.findElement(By.xpath("//input[@placeholder=\"Search store\"]")).sendKeys("Tshirts");
		
		//relative x path with multiple attribute
		driver.findElement(By.xpath("//input[@placeholder=\"Search store\"][@name=\"q\"]")).sendKeys("Tshirts");
		
		//relative x path with AND , OR attribute
		driver.findElement(By.xpath("//input[@placeholder=\"Search store\" and @name=\"q\"]")).sendKeys("Tshirts");
		driver.findElement(By.xpath("//input[@placeholder=\"Search store\" or @name=\"q\"]")).sendKeys("Tshirts");
		
		//relative x path with inner text -text()3
		driver.findElement(By.xpath("//a[text()=\"Electronics\"]")).click();
		
		//relative x path with contains
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Sea\")]")).sendKeys("T-shirts");
		
		//relative x path with starts-with
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("T-shirts");
		
		// chained x-path
		driver.findElement(By.xpath("//div[@class=\"picture\"]/a/img"));
		
		

		
	}

}
