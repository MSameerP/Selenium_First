package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsvsAction {
	public static void main(String[] args) {
		  
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act = new Actions(driver);
		
		WebElement clickMe=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Action task= act.contextClick(clickMe).build();
		task.perform();
		
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();
		
		driver.switchTo().alert().accept();
	}

}
