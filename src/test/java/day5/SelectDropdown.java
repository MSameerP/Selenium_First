package day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDropdown {
	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement sel =  driver.findElement(By.xpath("//select[@id='country']"));
		
		// by select method
		
		Select s = new Select(sel);

		s.selectByVisibleText("France");
		s.selectByIndex(3);
		s.selectByValue("india");
		
		// get the whole list
		
		List<WebElement> list = s.getOptions();
		System.out.println("Total no of elements in the list are: "+list.size());
		
		//printing the whole list
		for(WebElement x:list) {
			System.out.println(x.getText());
		}

	}
}
