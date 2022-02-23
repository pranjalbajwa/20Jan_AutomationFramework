package excelutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutility  

{

static String path="C:\\Users\\pranj\\eclipse2\\20Jan_AutomationFramework\\testdata\\information.xlsx";
public static String getreaddata(int row,int column) throws IOException
{
	String data="";
	try {
		
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		data=sheet.getRow(row).getCell(column).getStringCellValue();
				
	} 
	catch (FileNotFoundException e) 
	
	{
		System.out.println("issue in getRead data"+e);
		
	}
	
	return data;
	
}

public static int rowcount() throws IOException
{
int rownum=0;	
FileInputStream fis = new FileInputStream(path);
XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet = wb.getSheetAt(0);	
rownum=sheet.getLastRowNum();	
	
return rownum;
	
}
public static void main(String[] args) throws IOException
{
	int i=0;
	String name = getreaddata(i,0);
	String email = getreaddata(i,1);
	System.out.println(name);
	System.out.println(email);
}

}
