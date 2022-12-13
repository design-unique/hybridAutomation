package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExlData {
	
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	
	public static void readExceldata(String filepath, String sheetname) throws IOException
	{
		FileInputStream fis=new FileInputStream(filepath);
		
		workbook=new XSSFWorkbook(fis);
		
		sheet=workbook.getSheet(sheetname);
	}
	
	public static String readCelldata(int rowNum, int colNum)
	{
		cell=sheet.getRow(rowNum).getCell(colNum);
		String readcellValue = cell.getStringCellValue();
		
		return readcellValue;
				
		
	}

}
