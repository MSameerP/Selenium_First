package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1)find total number of rows in table
		int rows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		System.out.println("Number of rows are: "+rows);
		
		//2)find total number of columns
		int column = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
		System.out.println("Number of columns are: "+column);
		
		//3)read data from specific rows and column
		String data = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]/td[1]")).getText();
		System.out.println("Data is: "+data);
		
		//4)read data from all the rows and columns
		  for(int r=2;r<=rows;r++) {
			  for(int c=1;c<=column;c++) {
				  String value=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]/td["+c+"]")).getText();
				  System.out.print(value+"\t");
			  }
			  System.out.println();
		  }
		  
		  //5)reading element of table as per the condition
		  
		  for(int r=2;r<=rows;r++) {
			  
			  String authorName = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]/td[2]")).getText();
			  if(authorName.equals("Mukesh")) {
				  String bookName = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]/td[1]")).getText();
				  System.out.println(authorName+" : "+bookName);
			  } 
		  }
		  
		  //6) find total price of all the books
		  int total=0;
		  
		  for(int r=2;r<=rows;r++) {
			  String price = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]/td[4]")).getText();
			  total=total+Integer.parseInt(price);
		  }
		  System.out.println("Total price of books is: "+total);
		  
	}     

}
