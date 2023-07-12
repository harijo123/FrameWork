package org.mts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hello {
public static void main(String[] args) throws IOException  {
   
	//s1.path of excel
	File f = new File("C:\\Users\\Karthikraja\\eclipse-workspace\\FrameworkGreens\\excel\\hari.xlsx");
	
	//s2.read objects from file
//	FileInputStream fi = new FileInputStream(f);
	
	//s3.create book
	 Workbook w = new XSSFWorkbook();
	
	//s4.get sheet
	Sheet s = w.createSheet("details");
//	  //s4.1 get rows count
//            int rowscount = s.getPhysicalNumberOfRows();
//            System.out.println("ROWS COUNT :" +rowscount + "\n");
			  System.out.println("======");
			  
            //s5. to get row
            Row r = s.createRow(1);
            
            
            Cell c = r.createCell(0);
            
            c.setCellValue("UPSC");
            
            
            //s9. object to file
            FileOutputStream fos = new FileOutputStream(f);
            		
            //s10.update/write in workbook
            w.write(fos);
            
            

//            for (int i = 0; i < 10; i++) {
//            	  //s6. to create cell
//                Cell c = r.createCell(i);
//                
//                // to set value
//                if (i==0) {
//                    c.setCellValue("GOMS");
//
//				}
//                if (i==1) {
//                    c.setCellValue("G");
//
//				}
//                if (i==2) {
//                    c.setCellValue("FEMALE");
//
//				}
//                if (i==3) {
//                    c.setCellValue("GARDENING");
//				}
//                if (i==6) {
//					c.setCellValue("HHfg#11");
//				}
//                if (i==8) {
//					c.setCellValue(45);
//				}
//                if (i==9) {
//					c.setCellValue("Aunt");
//				}
//
//			}
          
            
            //s7. get cell value
 //           String stringCellValue = c.getStringCellValue();
            
            //s8. compare values
//            if (stringCellValue.equals("AUDIT")) {           	
//				c.setCellValue("GARDENING");
//			}
            
//            //s9. object to file
//            FileOutputStream fos = new FileOutputStream(f);
//            		
//            //s10.update/write in workbook
//            w.write(fos);
	
//	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {		
//		//s5.get row
//		Row r = s.getRow(i);		
//		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
//			//s6.get cell data
//			 Cell c = r.getCell(j);	
//			 CellType type = c.getCellType();
//             switch (type) {
//			case STRING:
//				String stringCellValue = c.getStringCellValue();
//				System.out.println(stringCellValue );
//				break;
//
//			case NUMERIC:
//				if(DateUtil.isCellDateFormatted(c)) {
//					// get date format
//					Date dateCellValue = c.getDateCellValue();
//					// convert to simple date format
//					SimpleDateFormat sim = new SimpleDateFormat("dd-MMMM-yyyy");
//					String format = sim.format(dateCellValue);
//					System.out.println(format );
//				}
//				
//			else {
//				double numericCellValue = c.getNumericCellValue();
//				//make decimal into whole value
//				long check = Math.round(numericCellValue);
//				//check deci and whole
//				if (numericCellValue==check) {
//					String v1 = String.valueOf(check);
//					System.out.println(v1);
//				}
//				else {
//					String v2 = String.valueOf(numericCellValue);
//					System.out.println(v2);
				}
//				BigDecimal a = BigDecimal.valueOf(numericCellValue);
//				String b = String.valueOf(a);
//				System.out.println(b);
//				break;
//			}
//			default:
//				break;
//			}
//		}
//		System.out.println( "\n" + "=============" + "\n");
//	}
  }


