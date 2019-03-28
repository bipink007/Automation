
package com.comcastnew.genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.examples.NewSheet;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
/**
 * 
 * @author piki
 *
 */


public class FileLib {
	/**
	 * @param Key
	 * @return value
	 * @throws IOException
	 */
	public String getPropertyKeyValue(String Key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		String value=pObj.getProperty(Key);
		return value;
		
	}
	/**
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return data
	 * @throws EncrypectedDocumentException
	 * @throws IOException
	 * 
	 */
	public String getExcelData(String sheetname,int rowIndex,int cellIndex)throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\piki\\Desktop\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row row=sh.getRow(rowIndex);
		Cell cel=row.getCell(cellIndex);
		String data=cel.getStringCellValue();
		return data;
		
		
		
	}	
		
		
		
	}
