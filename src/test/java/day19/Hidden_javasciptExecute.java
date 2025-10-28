package day19;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_javasciptExecute {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp");
		driver.manage().window().maximize();
		
		WebElement toggleButton =  driver.findElement(By.xpath("//button[normalize-space()=\"Toggle Hide and Show\"]"));
		toggleButton.click();
		
		WebElement box = driver.findElement(By.xpath("//div[@id=\"myDIV\"]"));
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.display='block';", box);
		
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].innerText='This is the newly set text'", box);
		
		
	}

}
