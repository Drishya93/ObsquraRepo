package excelRead;

import java.io.IOException;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException {
		String excel1 = ExcelReadNew1.getStringExcelData(1,0);
		System.out.println(excel1);
		String excel2 = ExcelReadNew1.getIntExcelData(1,1) ;
		System.out.println(excel2);

	}

}
