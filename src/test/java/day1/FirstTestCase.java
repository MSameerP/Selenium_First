package day1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Test Case
 -----
 1) Launch Browser (chrome)
 2) Open URL https://demo.opencart.com/
 3) Validate title should be "Your Store"
 4) Close Browser
 
 */

public class FirstTestCase {

	public static void main(String[] args) {
		
		String title = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		//1. Launching the browser
		// ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		try {
			
			
			//2. Open url
			//driver.get("https://www.amazon.in");
			driver.navigate().to("https://www.amazon.in");
			Thread.sleep(5000);
			
			//3. validate title
			String act_Title = driver.getTitle();
			
			if(act_Title.equals(title)) {
				System.out.println("Test Case passed...");
			}
			else {
				System.out.println("Test case failed....");
			}
			
			//4.close
			driver.quit();
	//	driver.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//driver.quit();
		}
		
		
		
	}

}
