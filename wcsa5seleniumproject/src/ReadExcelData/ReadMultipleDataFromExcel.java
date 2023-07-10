package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// Read data from IPL sheet..
		// implementation of read the data from sheet
		
		FileInputStream fis = new FileInputStream("./data/test data.xlsx.xlsx");// provide the 
		
		Workbook wb = WorkbookFactory.create(fis);//make the file for ready to read
		
		for (int i=1; i<10; i++)
		{
		Sheet sheet = wb.getSheet("IPL");//get into the sheet.
		
		Row row = sheet.getRow(i);// get into the desired row
		
		Cell cell = row.getCell(1);// get into the desired cell/column
		
		String data = cell.getStringCellValue();// read the data from cell
		
		System.out.println(data);
		
		Thread.sleep(2000);
		}
	}

}
