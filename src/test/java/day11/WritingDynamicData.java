package day11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicData {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\myfiles.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter how many rows");
		int noofRows = scn.nextInt();
		System.out.println("Enter how many cells");
		int noofcells = scn.nextInt();
		
		for(int i=0;i<noofRows;i++) {
			 
			 XSSFRow currentRow = sheet.createRow(i);
			 for(int j=0;j<noofcells;j++) {
				 currentRow.createCell(j).setCellValue(scn.next());
			 }
		 }  
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created....");
	}

}
