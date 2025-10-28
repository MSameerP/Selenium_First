package day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggest_Dropdown {
	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li//div[@role=\"option\"]"));
		
		System.out.println("Number of suggestions found are: "+list.size());
		
		for(WebElement x:list) {
			if(x.getText().equals("selenium")) {
				x.click();
				break;
			}
		}
	}
	

}
