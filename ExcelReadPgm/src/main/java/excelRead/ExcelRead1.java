package excelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {
	 static FileInputStream file;
		static XSSFWorkbook wbook;
		static XSSFSheet sheet;
		
	public static String getStringExcelData(int a, int b) throws IOException
		
		{
			file = new FileInputStream("C:\\Users\\Dell\\Desktop\\SalaryDetails.xlsx");
			wbook = new XSSFWorkbook(file);
			sheet = wbook.getSheet("Sheet1");
			XSSFRow row = sheet.getRow(a);
			XSSFCell cell =row.getCell(b);
			return cell.getStringCellValue();
			
			
		}
	public static String getIntExcelData(int a, int b) throws IOException
		
		{
			file = new FileInputStream("C:\\Users\\Dell\\Desktop\\SalaryDetails.xlsx");
			wbook = new XSSFWorkbook(file);
			sheet = wbook.getSheet("Sheet1");
			XSSFRow row = sheet.getRow(a);
			XSSFCell cell =row.getCell(b);
			int x = (int) cell.getNumericCellValue();  //type casting(changing from one data type to another type)
			return String.valueOf(x);
			
		}
		

}
