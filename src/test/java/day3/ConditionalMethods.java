package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplayed()
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		System.out.println("isDisplayed: "+logo.isDisplayed());
		
		//isenabled -- check whether it is allowing us to enter the data (used for checkbox, input box)
		
	    boolean isena= 	driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
	    System.out.println("Isenabled: "+isena);
	    
	    //isSelected
	    
	   WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
	   WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
	   System.out.println("Before selecting.............");
	   System.out.println("male btn: "+male.isSelected());
	   System.out.println("female btn: "+female.isSelected());
	   
	   System.out.println("After selecting.......");
	   male.click();
	   System.out.println("male btn: "+male.isSelected());
	   System.out.println("female btn: "+female.isSelected());
		
		
		
	}

}
