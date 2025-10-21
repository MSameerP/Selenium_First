package day10;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+links.size());
		 
		for(WebElement x:links) {
			 String value = x.getAttribute("href");
			 if(value==null || value.isEmpty()) {
				 System.out.println("href attribute value is null or empty. So not possible to  check");
				 continue;
			 }
			 
			 //hit URL to the server
			 URL linkUrl = new URL(value);
			 HttpURLConnection con = (HttpURLConnection) linkUrl.openConnection();
			 con.connect();
			 
			 if(con.getResponseCode()>=400) {
				 System.out.println(value+"----Broken Links");
			 }else {
				 System.out.println(value+"----Not a broken link");
			 }
			  
		}
			
		
		
	}

}
