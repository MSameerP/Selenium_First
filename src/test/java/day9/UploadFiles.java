package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file upload
		driver.findElement(By.xpath("//input[@id=\"filesToUpload\"]")).sendKeys("C:\\Users\\SAMEER\\Downloads\\Pension details.txt");
		
		//multiple file upload
		String f1 = "C:\\Users\\SAMEER\\Downloads\\Pension details.txt";
		String f2 = "C:\\Users\\SAMEER\\Downloads\\voter_id.jpg";
		driver.findElement(By.xpath("//input[@id=\"filesToUpload\"]")).sendKeys(f1+"\n"+f2); 
		
		
	}

}
