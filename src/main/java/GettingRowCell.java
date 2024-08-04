import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GettingRowCell {

	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\WorkSpace2Java\\MavenTraining\\Excel\\Book2.xlsx");
		
		FileInputStream read= new FileInputStream(f);
		
		Workbook formate= new XSSFWorkbook(read);
		
		Sheet sh = formate.getSheet("Cute");
		
		int numberOfRows = sh.getPhysicalNumberOfRows();
		System.out.println("Number of Rows "+numberOfRows);
		
		Row r = sh.getRow(1);
		
		int numberOfCells = r.getPhysicalNumberOfCells();
		System.out.println("Number of cells "+numberOfCells);
		
	   for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {
		   
		   Cell c = r.getCell(i);
		   System.out.println(c);
		   
		
	}
		
	
	}
}
