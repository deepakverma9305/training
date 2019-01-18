package exceSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelSheet1 {

	public static void main(String[] args) 

	
	{
		
		
		File File1= new File ("C:\\Users\\Tera\\Desktop\\Train.xlsx");
		
		
		try {
			Workbook w1= WorkbookFactory.create(File1);
			
		//	w1.getActiveSheetIndex();
			
			//int i= w1.getActiveSheetIndex();
			
			//System.out.println(i);
			
			int j= w1.getSheetAt(0).getLastRowNum();
			 
			System.out.println(j);
			Sheet sheet1 =w1.getSheetAt(0);
			
			for(int k = 0; k<=j-1; k++) {
			
			
			Row s3= sheet1.getRow(k);
			int m= s3.getLastCellNum();
			
			for(int n = 0; n<=m-1; n++) {
			
			System.out.println(s3.getCell(n).toString());
			}
			
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
