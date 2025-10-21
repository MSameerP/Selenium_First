package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		box1.clear();
		box1.sendKeys("This is Sam");
		
		Actions act = new Actions(driver);
		
		act.doubleClick(btn).perform();
		
		String text1 = box1.getAttribute("value");
		String text2 = box2.getAttribute("value");
		
		System.out.println(text1+": "+text2);
		
		if(text1.equals(text2)) {
			System.out.println("Successfull");
		}else {
			System.out.println("Failed");
		}
		

		
		
		
		
		
		
		
	}

}
