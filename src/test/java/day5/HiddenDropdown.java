package day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {
	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();
	// 	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPimModule");
		
		driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[3]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
		
		
		
		//to get all the elemets
		List<WebElement> list = driver.findElements(By.xpath("//div[@role=\"listbox\"]/div[@role=\"option\"]"));
		System.out.println("Total elements are: "+list.size());
		for(WebElement x:list) {
			System.out.println(x.getText());
		}
		
		//select single element
		driver.findElement(By.xpath("//span[normalize-space()='Full-Time Probation']")).click();
		
	}

}
