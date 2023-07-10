package ReadExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// Read data from IPL sheet..
		// implementation of read the data from sheet
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx.xlsx");// provide the 
		
		Workbook wb = WorkbookFactory.create(fis);//make the file for ready to read
		
		Sheet sheet = wb.getSheet("IPL");//get into the sheet.
		
		Row row = sheet.createRow(11);// get into the desired row
		
		Cell cell = row.createCell(0);// get into the desired cell/column
		cell.setCellValue("Pune");
		
		FileOutputStream fos= new FileOutputStream("./data/TestData.xlsx.xlsx");
		wb.write(fos);
	}
	

}