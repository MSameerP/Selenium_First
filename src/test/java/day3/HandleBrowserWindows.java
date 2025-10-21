package day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> wids= driver.getWindowHandles();
		
		//Approach 1
		List<String> wl = new ArrayList(wids);
		String parentId = wl.get(0);
		String childId = wl.get(1);
		
		// switch to
		driver.switchTo().window(childId);
		
		// Approach 2
		
		for(String x:wids) {
			
			String wname = driver.switchTo().window(x).getTitle();
			System.out.println(wname);
			if(wname.equals("OrangeHRM")) {
				System.out.println("Driver focussed on "+driver.getCurrentUrl());
				driver.close();
			}
		
		}
			
	}

}
