package day11;

import java.nio.channels.SelectableChannel;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();		
		String filePath = System.getProperty("user.dir")+"\\Testdata\\TestData.xlsx";
		int row = ExcelUtility.getRowCount(filePath, "Sheet2");
		
		for(int i=1;i<=row;i++) {
			//1)read data from excel
			
			String price = ExcelUtility.getCellData(filePath,"Sheet2",i,0);
			String rateOfInterest = ExcelUtility.getCellData(filePath, "Sheet2",i,1);
			String per1 = ExcelUtility.getCellData(filePath,"Sheet2",i,2);
			String per2 = ExcelUtility.getCellData(filePath,"Sheet2",i,3);
			String freq = ExcelUtility.getCellData(filePath,"Sheet2",i,4);
			String exp_mvalue = ExcelUtility.getCellData(filePath,"Sheet2",i,5);
			
			// pass above data into application
			
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(price);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateOfInterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			
			Select perdrp = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdrp.selectByVisibleText(per2);
			
			Select freqdrp = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			freqdrp.selectByVisibleText(freq);
			
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click(); //clicked on calculate
			
			// validation
			
			String act_value = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_mvalue) == Double.parseDouble(act_value)) {
				System.out.println("Test Passed....");
				ExcelUtility.setCellData(filePath, "Sheet2", i, 7, "Passed");
				ExcelUtility.fillGreenColor(filePath, "Sheet2", i, 7);
				
			}else {
				System.out.println("Test Failed....");
				ExcelUtility.setCellData(filePath, "Sheet2", i, 7, "Failed");
				ExcelUtility.fillRedColor(filePath, "Sheet2", i, 7);
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
		}
		
		driver.quit();
	}

}
