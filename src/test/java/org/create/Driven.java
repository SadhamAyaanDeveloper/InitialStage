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

public class Driven extends BaseInfo {
	
	public static void main(String[] args) throws IOException {
		
		File F=new File("D:\\WorkSpace2Java\\MavenTraining\\Excel\\Book1.xlsx");
		
		FileInputStream read = new FileInputStream(F);
		
		Workbook book= new XSSFWorkbook(read);
		
		Sheet sh = book.getSheet("Sheet1");
		
		Row r = sh.getRow(2);
		
		Cell c = r.getCell(2);
		
		System.out.println(c);
		
		
	    
		
		
		
	}

}
