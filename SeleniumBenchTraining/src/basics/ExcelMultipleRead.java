package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelMultipleRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./Data/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook =  WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Login");
		int row_size=sheet.getPhysicalNumberOfRows();
		int col_size=sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<row_size;i++) {
			for (int j = 0; j < col_size; j++) {
				System.out.print(sheet.getRow(i).getCell(j).toString()+"  ");
			}
			System.out.println();
		}
	}
}
