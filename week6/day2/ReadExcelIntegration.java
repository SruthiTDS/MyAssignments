package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelIntegration {
	public static String[][] ReadExcel(String filename) throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		
		//Row Count
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Total no of rows:"+lastRowNum);
		
		//Column Count
		
		int lastCellNum = sheet.getRow(lastRowNum).getLastCellNum();
		System.out.println("Total no of columns:"+lastCellNum);
		
		String[][] data=new String [lastRowNum][lastCellNum];
		
		for(int i=1;i<=lastRowNum;i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<lastCellNum;j++) {
				XSSFCell cell=row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				data[i-1][j]=stringCellValue;
				
			}
		}
		wb.close();
		return data;
	}

}
