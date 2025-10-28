package day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_Picker2 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//input
		String year = "2021";
		String month = "Jul ";
		String day = "23";
		
		//datepicker
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		//select year
		WebElement month_element = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select se_month = new Select(month_element);
		se_month.selectByVisibleText(month);
		
		//select month
		WebElement year_element = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select se_year = new Select(year_element);
		se_year.selectByVisibleText(year);
		
		//select day
		List<WebElement> list= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td/a"));
		for(WebElement x:list) {
			if(x.getText().equals(day)) {
				x.click();
				break;
			}
		}
		
		
		
	}

}
