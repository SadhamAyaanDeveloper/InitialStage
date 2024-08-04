package org.create;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchingDetails {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\WorkSpace2Java\\MavenTraining\\Excel\\Book1.xlsx");
		
		FileInputStream read = new FileInputStream(f);
		
		Workbook formate = new XSSFWorkbook(read);
		
		Sheet sh = formate.getSheet("Sheet1");
		
	    int numberOfRows = sh.getPhysicalNumberOfRows();
	    System.out.println("No of Rows "+ numberOfRows);
	    
	    Row r = sh.getRow(4);
	    
	    int physicalNumberOfCells = r.getPhysicalNumberOfCells();
	    System.out.println("No of Cells "+physicalNumberOfCells);
	    
	    
	    
	    
		
		
		
	}

}
