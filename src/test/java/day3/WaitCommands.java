package day3;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCommands {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	/*	
		WebElement ele =  driver.findElement(By.linkText("OrangeHRM, Inc"));
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement ele2 =  w.until(ExpectedConditions.visibilityOf(ele));
		ele2.click();
		*/
		//Explicit wait
		
		WebDriverWait wbwait = new WebDriverWait(driver, Duration.ofSeconds(10));  // declaration of explicit wait
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement we= wbwait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("OrangeHRM, Inc")));
		we.click();
		
		//Fluent wait
		 
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(2))
			       .ignoring(NoSuchElementException.class);

			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.linkText("OrangeHRM, Inc"));
			     }
			   });
			   
			   foo.click();
		

		
		
		
		
	}

}
