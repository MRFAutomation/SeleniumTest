package mrf.excel.read;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import mrf.base.methods.StringConstantsSelenium;

public class ExcelRead {

	public static void main(String[] args) {
		XSSFWorkbook exWBook;
		XSSFSheet exSheet;
		XSSFCell exCell;
		try {
			FileInputStream exFile = new FileInputStream(StringConstantsSelenium.excelReadFilePath);
			exWBook = new XSSFWorkbook(exFile);
			exSheet = exWBook.getSheet(StringConstantsSelenium.excelSheetName);
			exCell = exSheet.getRow(0).getCell(0);
			String cellData = exCell.getStringCellValue();
			System.out.println(cellData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
