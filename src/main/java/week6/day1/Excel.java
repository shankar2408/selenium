package week6.day1;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class Excel {
	
@Test	
public void reExcel() throws IOException
{
	XSSFWorkbook wBook = new XSSFWorkbook("./data/loginExcel.xlsx");
	XSSFSheet sheet = wBook.getSheet("login");
	int rowCount = sheet.getLastRowNum();
	System.out.println(rowCount);
	short columnCount = sheet.getRow(0).getLastCellNum();
	for(int i=1; i<=rowCount; i++) {
		XSSFRow row = sheet.getRow(i);
	for (int j=0; j<columnCount; j++) {
		XSSFCell cell = row.getCell(j);
			String data = cell.getStringCellValue();
			System.out.println(data);		
	}
	}
	wBook.close();
	}


}