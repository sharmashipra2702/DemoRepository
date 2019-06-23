package uiFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	File f;
	FileInputStream fis;
	XSSFWorkbook wb;
	
	public ExcelReader(String excelPath) throws IOException {
		f = new File(excelPath);
		fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
	}
	
	public int totalRows(String sheetName){
		XSSFSheet sh = wb.getSheet(sheetName);
		return sh.getLastRowNum();
	}
	
	public static void main(String [] args) throws IOException {
		ExcelReader read = new ExcelReader("E://Test_Data.xlsx");
		System.out.println(read.totalRows("Login"));	
	}
}
