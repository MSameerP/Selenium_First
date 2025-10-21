package day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider = "dp")
	void testLog(String email, String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(4000);
		
		boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		
		if(status==true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}
	
	@AfterMethod
	void tearDown() {
		driver.close();
	}
	
	@DataProvider(name = "dp",indices = {0,3,4})
	Object[][] loginData() {
		
		Object data[][] = {
				{"abc@gmail.com","test125"},
				{"xyz@gmail.com","test129"},
				{"john@gmail.com","test183"},
				{"samc123@gmail.com","test@123"},
				{"abcd@gmail.com","test@123"},
		};
		
		return data;
	}

}
