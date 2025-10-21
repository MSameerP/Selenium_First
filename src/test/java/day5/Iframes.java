package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.AllArguments;


public class Iframes {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		// passing frame as webElement
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();
		
		//next one
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		driver.switchTo().defaultContent();
		
		// iframe inside frame
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("JAVA");
		
		//accessing inner frame by index
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		
		
		
		//click the radio button by javascript executioner
		WebElement element = driver.findElement(By.xpath("//div[@id='i21']//div[@class='uHMk6b fsHoPb']"));
		JavascriptExecutor execute = (JavascriptExecutor)driver;
		execute.executeScript("arguments[0].click();",element);
		
		driver.switchTo().defaultContent();
		
		
	}

}
