package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Table {
	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		//login
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//close window if its available
		
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		//showing 1 to 10 of 22054 (2206 pages)
		String text = driver.findElement(By.xpath("//div[contains(text(),\"Pages\")]")).getText();
		int total_Pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		
		//reading pages
		for(int p=1;p<total_Pages;p++) {
			
			if(p>1) {
				driver.findElement(By.xpath("//ul[@class=\"pagination\"]//li[@class=\"page-item\"]//a[normalize-space()="+p+"]")).click();
			}
			
			//reading data from pages
			int rows = driver.findElements(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody/tr")).size();
			
			for(int r=1;r<=rows;r++) {
				
				String customerName = driver.findElement(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr["+r+"]/td[2]")).getText();
				String email = driver.findElement(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr["+r+"]/td[3]")).getText();
				System.out.println(customerName+" : "+ email);
				
				
			}
		}
		
		
	}

}
