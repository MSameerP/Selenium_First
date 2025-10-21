package day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutions {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//passing text in input box -- alternative for send key()
		WebElement inpt = driver.findElement(By.xpath("//input[@id=\"name\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','John')",inpt);
		
		//clicking on element -- alternate of click()
		WebElement rdbtn = driver.findElement(By.xpath("//input[@id=\"male\"]"));
		js.executeScript("arguments[0].click()", rdbtn);
	}

}
