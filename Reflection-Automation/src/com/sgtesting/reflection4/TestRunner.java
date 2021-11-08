package com.sgtesting.reflection4;

import java.io.FileInputStream;
import java.lang.reflect.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestRunner {
	private static String path=null;
	public static void main(String[] args) {
		testRunner();
	}
	private static void testRunner()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			path=System.getProperty("user.dir");
			fin=new FileInputStream(path+"\\DataFiles\\data_Runner.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				cell=row.getCell(1);
				String pkgclassname=cell.getStringCellValue();
				
				System.out.println(pkgclassname+ " ----> "+methodname);
				
				Class cls=Class.forName(pkgclassname);
				Object obj=cls.getDeclaredConstructor().newInstance();
				
				Method method=obj.getClass().getMethod(methodname);
				method.invoke(obj);
			
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
