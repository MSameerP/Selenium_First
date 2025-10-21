 package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement min = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		WebElement max = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		
		System.out.println("min slider location before"+min.getLocation()); //59,257
		System.out.println("max slider location before"+max.getLocation()); //545,257
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(min,350,0).perform();
		act.dragAndDropBy(max,-45,0).perform();
		
		System.out.println("min slider location after"+min.getLocation());
		System.out.println("max slider location after"+max.getLocation());
		
		
		
	}

}
