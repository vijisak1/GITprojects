package extentreport;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel

{
	// @Test
	public Object[][] Readexcel(String filename) throws IOException {
		
		XSSFWorkbook wBook = new XSSFWorkbook("./data/" + filename + ".xlsx");
		XSSFSheet sheet = wBook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		short columnCount = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++)
		
		{
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++)
			
			{
				XSSFCell cell = row.getCell(j);
				data[i - 1][j] = cell.getStringCellValue();
				
			}
			wBook.close();
		}
		return data;
		
	}
}
