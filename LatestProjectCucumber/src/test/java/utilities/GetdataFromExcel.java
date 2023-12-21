package utilities;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import constants.Constants1;


public class GetdataFromExcel 
{
	//method is written to get the url from excel
    public static String geturl() throws IOException
    {
    	//which input stream method get the path of the excel 
	FileInputStream fs = new FileInputStream(Constants1.TESTDATAPATH);
	// to access workbook use xssfworkbook
   // @SuppressWarnings("resource")
	@SuppressWarnings("resource")
	XSSFWorkbook workbook = new XSSFWorkbook(fs);
    //get the sheet number if there are multiple sheets
    XSSFSheet sheet = workbook.getSheetAt(0);
    //Get the cell value to fetch the url 
    XSSFCell value = sheet.getRow(1).getCell(0);
    // convert the value stored in the cell to string 
     String URL = value.toString(); 
     
     //return the url
    return URL; 
    
    
    }
    
}
