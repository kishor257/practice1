package writeExcelSheet;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestExcel2 {
	
public static void main(String[] args) {
		
		try {
			Workbook w = WorkbookFactory.create(new FileInputStream("./excelFiles/input4.xlsx"));
			//existing row existing cell
//			Sheet s = w.getSheet("Sheet1");
//			Row r = s.getRow(0);
//			Cell c = r.getCell(0);
//			c.setCellValue("BTM");
			
			//existing row new cell, If existing row is not there NullPointerException
			Sheet s = w.getSheet("Sheet1");
			Row r = s.getRow(0);
			Cell c = r.createCell(2);
			c.setCellValue("BTM4");
			
			Sheet s1 = w.getSheet("Sheet1");
			Row r1 = s.createRow(2);
			Cell c1 = r.createCell(1);
			c1.setCellValue("BTM7");
			
			w.write(new FileOutputStream("./excelFiles/input4.xlsx"));
			System.out.println("written in excel sheet succesfully");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("code not working");
		}
	}


}
