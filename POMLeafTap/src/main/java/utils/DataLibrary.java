package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {

	public static String[][] readValue(String fileData) throws IOException {

	XSSFWorkbook wb= new XSSFWorkbook("./data/"+fileData+".xlsx");
	XSSFSheet sheet= wb.getSheetAt(0);
	int rowCount = sheet.getLastRowNum();
	short cellCount = sheet.getRow(1).getLastCellNum();
	
	String[][] data = new String[rowCount][cellCount];
	for (int i = 1; i <= rowCount; i++) {
		for (int j = 0; j < cellCount; j++) {
			String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
			data[i-1][j]=stringCellValue;
		}
	}
	wb.close();
	return data;

	}

}
