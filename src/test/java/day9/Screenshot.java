package day9;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		//full page screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+"\\Screenshot\\full_Page.png");
		sourceFile.renameTo(targetFile); //copy source file to target file
		
		//capture screenshot from specific portion
		
		WebElement featureProduct = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourceFile2 = featureProduct.getScreenshotAs(OutputType.FILE);
		File targetFile2 = new File(System.getProperty("user.dir")+"\\Screenshot\\full_Page2.png");
		sourceFile2.renameTo(targetFile2);
		
		// capture screenshot of webelement
		//it is same as 2nd one 
		driver.quit();
	}

}
