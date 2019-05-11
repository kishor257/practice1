package writeExcelSheet;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcelSheet {
	
	@Test
	public void testExcel() throws Exception{
		
		File f=new File("./excelFiles/input.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("First Sheet");
		sh.createRow(0).createCell(0).setCellValue("Age");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("written succesfully in excel sheet");
	}
}
