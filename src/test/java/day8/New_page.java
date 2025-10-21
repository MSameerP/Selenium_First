package day8;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class New_page {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement reg=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(reg).keyUp(Keys.CONTROL).perform();
		
		Set<String> wlist=driver.getWindowHandles();
		List<String> li = new ArrayList<String>(wlist);
		
		System.out.println(wlist);
		
		driver.switchTo().window(li.get(1));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Welcome");
		
		
		driver.switchTo().window(li.get(0));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Welcome"); 
		
		
		
	}

}
