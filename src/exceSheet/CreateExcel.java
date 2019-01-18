package exceSheet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

	public static void main(String[] args) {
		
		
		File File1= new File ("C:\\Users\\Tera\\Desktop\\Train.xlsx");
		
		try {
			
			
			XSSFWorkbook  w1= new XSSFWorkbook();
			
			
		    Sheet s1= w1.createSheet("Deepak");
		    for(int j = 0; j<=5; j++) {
		        	
		    
		    Row row1= s1.createRow(j);
		    for(int i = 0; i<=5; i++) {
	        Cell c1=row1.createCell(i);
	        c1.setCellValue("This is Best_test"+i);}
		    }
	        FileOutputStream f1= new FileOutputStream(File1);
	        w1.write(f1);
	        
		
		
		
		
		
		
		
		
		
		
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
