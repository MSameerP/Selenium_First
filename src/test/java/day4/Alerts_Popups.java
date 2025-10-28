package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Popups {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Normal alert with okay button
		//driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		
	//	driver.switchTo().alert().accept();
		
	/*	Alert myAlert= driver.switchTo().alert();
		System.out.println(myAlert.getText());
		Thread.sleep(5000);
		myAlert.accept(); */
		
		// confirmation alert -- okay and cancel
	/*	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Alert myAlert= driver.switchTo().alert();
		System.out.println(myAlert.getText());
		Thread.sleep(5000);
		
		//accept it
		myAlert.accept();
		
		//decline it
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss(); */
		
		
		//Prompting Alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert myAlert= driver.switchTo().alert();
		myAlert.sendKeys("Hello Dear");
		myAlert.accept();
		
		
		
		
	}

}
