package org.create;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GettingString {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File("D:\\WorkSpace2Java\\MavenTraining\\Excel\\Book3.xlsx");
		
		FileInputStream read = new FileInputStream(f);
		
		Workbook formate = new XSSFWorkbook(read);
		
		Sheet sh = formate.getSheet("Sheet1");
		
		for (int i = 0; i <sh.getPhysicalNumberOfRows(); i++) {
			
			Row r = sh.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				//System.out.println(c);
				
				int type = c.getCellType();
				//System.out.println(type);
				
				if(type==1) {
					String letter = c.getStringCellValue();
					//System.out.println(letter);
				}
				
				else if (DateUtil.isCellDateFormatted(c)) {               //Gathering date cell
					
					Date d = c.getDateCellValue();                        //collecting cell date value
					
					SimpleDateFormat sd= new SimpleDateFormat("ddMMMYYYY"); // creating date formate
					String df = sd.format(d);                             // converting as a String
					
					//System.out.println(df);                               
				}
				
				// Fetching Numeric Value
				
				else {
					double numeric = c.getNumericCellValue();
					
					long l=(long)numeric;  // Down casting type
					
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);
				}
				
			}
		}
	
		
	}

}
