package day1;

import java.util.List;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_First {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo-opencart.com/");
		driver.manage().window().maximize();
		
		// id
		boolean status = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println("Display status is: "+status);
		
		//name
		 driver.findElement(By.name("search")).sendKeys("Mac");
		
		// linktext
		
		// driver.findElement(By.linkText("Contact Us")).click();
		
		// class
		// List<WebElement> li= driver.findElements(By.className("col mb-3"));
		// System.out.println("Total number of colums: "+li.size());
		
		// tagname
		List<WebElement> l2 = driver.findElements(By.tagName("a"));
		System.out.println("total number of anchor tag is: "+l2.size());
		System.out.println(l2);
	}

}
