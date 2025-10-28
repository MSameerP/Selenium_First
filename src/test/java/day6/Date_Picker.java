package day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	static void selectFutureDate(WebDriver driver, String year, String month, String day) {

		// select month and year
		while (true) {
			String current_Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

			if (current_month.equals(month) && current_Year.equals(year)) {
				break;
			}

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // next
			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-w']")).click(); //previous

		}

		// select date
		List<WebElement> full_dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td/a"));

		for (WebElement x : full_dates) {
			if (x.getText().equals(day)) {
				x.click();
				break;
			}
		}
	}

	static void selectPreviousDate(WebDriver driver, String year, String month, String day) {

		// select month and year
		while (true) {
			String current_Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

			if (current_month.equals(month) && current_Year.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // previous

		}

		// select date
		List<WebElement> full_dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td/a"));

		for (WebElement x : full_dates) {
			if (x.getText().equals(day)) {
				x.click();
				break;
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		// switch to frame
		driver.switchTo().frame(0);

		// method 1 using send keys
		// driver.findElement(By.xpath("//body/p/input[@id
		// =\"datepicker\"]")).sendKeys("08/17/2027"); //mm/dd/yyyy

		// method 2
		String year = "2024";
		String month = "June";
		String day = "6";
		driver.findElement(By.xpath("//input[@class=\"hasDatepicker\"]")).click();

		
		//selectFutureDate(driver, year, month, day);
		selectPreviousDate(driver, year, month, day);

	}

}
