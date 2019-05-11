package writeExcelSheet;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet2 {
	
public static void main(String[] args) throws Exception{
		
		File f=new File("./excelFiles/input2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("First Sheet");
		sh.createRow(0).createCell(0).setCellValue("Age");
		sh.getRow(0).createCell(1).setCellValue(69);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("written succesfully in excel sheet");
	}
}
