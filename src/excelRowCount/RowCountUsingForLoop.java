package excelRowCount;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowCountUsingForLoop {
	
	public static void main(String[] args) throws Exception {
		
		Workbook w = WorkbookFactory.create(new FileInputStream("./src/excelRowCount/RowCountUsingForLoop.xlsx"));
		
		for (int i = 1; i <= 4; i++) {
			//String s = w.getSheet("sheet1").getRow(i).getCell(1).toString();
			double s = w.getSheet("Sheet1").getRow(i).getCell(2).getNumericCellValue();
			System.out.println(s);
		}
	}
}
