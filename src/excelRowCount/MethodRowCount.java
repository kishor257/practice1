package excelRowCount;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MethodRowCount {

	public int rowCount(){

		int count=0;
		try{
			FileInputStream fs=new FileInputStream("./src/excelRowCount/MethodRowCount.xlsx");
			Workbook wb = WorkbookFactory.create(fs);
			count = wb.getSheet("Sheet1").getLastRowNum();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	public String getXLData(int r,int c)
	{
		String v="";
		try {
			Workbook w = WorkbookFactory.create(new FileInputStream("./src/excelRowCount/MethodRowCount.xlsx"));
			v=w.getSheet("Sheet1").getRow(r).getCell(c).toString();
		}
		catch(Exception e) { e.printStackTrace();}
		return v;
	}
	public static void main(String[] args){
		MethodRowCount mcr=new MethodRowCount();
		int rc = mcr.rowCount();

		for(int i=1;i<=rc;i++){
			String un=mcr.getXLData(i,0);
			String pw=mcr.getXLData(i,1);
			System.out.println(un+"\t"+pw);
		}
	}
}
