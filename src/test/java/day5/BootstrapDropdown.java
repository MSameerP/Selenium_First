package day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {
	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		//click the button first
		driver.findElement(By.xpath("//button[contains(@class,\"multiselect\")]")).click();
		
		//now select the element
		driver.findElement(By.xpath("//input[@value='HTML']")).click();
		driver.findElement(By.xpath("//input[@value='CSS']")).click();
		
		//selecting multiple
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,\"multiselect\")]//label"));
		System.out.println("Total no of elements are: "+list.size());
		for(WebElement x:list) {
			System.out.println(x.getText());
		}
		
		for(WebElement x:list) {
			if(x.getText().equals("Java") || x.getText().equals("Python") || x.getText().equals("Oracle")) {
				x.click();
			}
		}
	}

}
