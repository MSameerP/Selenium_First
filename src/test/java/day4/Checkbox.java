package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//for specific checkbox
		//driver.findElement(By.xpath("//input[@id=\"sunday\"]")).click();
		
		//for multiple checkbox
		List<WebElement> list = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
	/*	
		for(int i=0;i<list.size();i++) {
			list.get(i).click();
		} */
		
	/*	for(WebElement x: list) {
			x.click();
		} */
		
		// select last 2
		//7-2=5
		for(int i=5;i<list.size();i++) {
			list.get(i).click();
		}
		
		//select first 2
		for(int i=0;i<2;i++) {
			list.get(i).click();
		}
		
		Thread.sleep(Duration.ofSeconds(5));
		
		//select based on selected or unselected condition
		for(WebElement x:list) {
			if(x.isSelected()) {
				x.click();
			}
		}
		
		Thread.sleep(Duration.ofSeconds(5));
		driver.close();
		
	}

}
