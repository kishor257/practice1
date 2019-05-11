package excelRowCount;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowCount {

	public static void main(String[] args) {

		int  count=0;
		try {
			Workbook w = WorkbookFactory.create(new FileInputStream("./src/excelRowCount/RowCount.xlsx"));
			count=w.getSheet("Sheet1").getLastRowNum();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//count++ not requird here but i used it bcoz here index starts from 0
		count++;
		System.out.println("No of rows present in excel sheet are "+count);
	}
}
