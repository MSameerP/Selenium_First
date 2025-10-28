package day11;

import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.text.Utilities;

import org.apache.poi.xssf.extractor.XSSFExcelExtractor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelData {
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\TestData.xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		 int totalRows = sheet.getLastRowNum();
		 int totalCells = sheet.getRow(1).getLastCellNum();
		 
		 System.out.println("Number of rows: "+totalRows);
		 System.out.println("Number of columns: "+totalCells);
		 
		 for(int i=0;i<=totalRows;i++) {
			 
			 XSSFRow currentRow = sheet.getRow(i);
			 for(int j=0;j<totalCells;j++) {
				 System.out.print(currentRow.getCell(j).toString()+"\t");
			 }
			 
			 System.out.println();
		 }
		 
		 workBook.close();
		 file.close();
		 
		
	}

}
