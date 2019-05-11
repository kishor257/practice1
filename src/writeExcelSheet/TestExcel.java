package writeExcelSheet;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestExcel {
	
	public static void main(String[] args) {
		
		try {
			Workbook w = WorkbookFactory.create(new FileInputStream("./excelFiles/input3.xlsx"));
			
			//existing row existing cell
			//w.getSheet("sheet1").getRow(0).getCell(0).setCellValue("abc");
			
			//existing row new cell		
			//w.getSheet("sheet1").getRow(0).createCell(1).setCellValue("def");
			
			//new row new cell
			//w.getSheet("Sheet1").createRow(0).createCell(1).setCellValue("sneha");
			
			//existing row set value
			w.getSheetAt(0).createRow(0).createCell(0).setCellValue("sanjeeth");
			
			//create sheet new row new cell, if sheet is already present then IllegalArgumentException
			//w.createSheet("my sheet").createRow(1).createCell(1).setCellValue("kumar");
			
			w.write(new FileOutputStream("./excelFiles/input3.xlsx"));
			System.out.println("written in excel sheet succesfully");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("code not working");
		}
	}
}
