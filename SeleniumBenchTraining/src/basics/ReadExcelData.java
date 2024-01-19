package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		readmultipleData();
	}

	public static String[][] readmultipleData() throws EncryptedDocumentException, IOException {
		File file = new File("./Data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Login");
		int row_size = sheet.getPhysicalNumberOfRows();
		int col_size = sheet.getRow(0).getPhysicalNumberOfCells();
		//Array declaration size
		String[][] data = new String[row_size-1][col_size];
		//iteration condition
		for (int i = 0; i < row_size-1; i++) {
			for (int j = 0; j < col_size; j++) {
				//fetch values from incremented excel row index
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
		}

		return data;

		/*
		 * for (int i = 0; i < row_size; i++) { for (int j = 0; j < col_size; j++) {
		 * System.out.print(data[i][j] + "  "); } System.out.println(); }
		 */

	}
}
