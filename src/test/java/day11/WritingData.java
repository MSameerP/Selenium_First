package day11;


import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\myfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data");
		XSSFRow row1 = sheet.createRow(0);
			row1.createCell(0).setCellValue("Java");
			row1.createCell(1).setCellValue(20);
			row1.createCell(2).setCellValue("Automation");
			
		XSSFRow row2 = sheet.createRow(1);
			row2.createCell(0).setCellValue("Selenium");
			row2.createCell(1).setCellValue(19);
			row2.createCell(2).setCellValue("Library");
			
			XSSFRow row3 = sheet.createRow(2);
			row3.createCell(0).setCellValue("Apache");
			row3.createCell(1).setCellValue(21);
			row3.createCell(2).setCellValue("Server");
			
		workbook.write(file);
		workbook.close();
		file.close();
	
	} 

}
