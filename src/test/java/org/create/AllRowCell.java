package org.create;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AllRowCell {
	
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\WorkSpace2Java\\MavenTraining\\Excel\\Book3.xlsx");
		
		FileInputStream read = new FileInputStream(f);
		
		Workbook formate = new XSSFWorkbook(read);
		
		Sheet sh = formate.getSheet("Sheet1");
		
		int numberOfRows = sh.getPhysicalNumberOfRows();
		System.out.println("No of Rows "+numberOfRows);
		
		for (int i = 1; i < 10; i++) {
			
			Row r = sh.getRow(i);
			
			for (int j = 0; j <5; j++) {
				
				Cell c = r.getCell(j);
				System.out.println(c);
				
				
			}
			
			
			
		}
		
		
	}
	

}
