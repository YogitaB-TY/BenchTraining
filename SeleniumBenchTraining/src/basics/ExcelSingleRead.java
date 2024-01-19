package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSingleRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./Data/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook =  WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Login");
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(0);
		System.out.println(cell.toString());
	}
}
