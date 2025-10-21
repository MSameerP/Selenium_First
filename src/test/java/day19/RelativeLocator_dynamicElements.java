package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocator_dynamicElements {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		WebElement se1 = driver.findElement(By.name("password"));

		WebElement dynamic_Element = driver.findElement(RelativeLocator.with(By.tagName("input")).above(se1));
		dynamic_Element.sendKeys("Sameer");
		System.out.println(dynamic_Element.getAttribute("value"));
		
		
	}

}
