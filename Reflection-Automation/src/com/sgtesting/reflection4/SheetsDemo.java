package com.sgtesting.reflection4;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SheetsDemo {
	private static String path=null;
	public static void main(String[] args) {
		sheetsInfo();

	}

	static void sheetsInfo()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		try
		{
			path=System.getProperty("user.dir");
			fin=new FileInputStream(path+"\\DataFiles\\data_Runner.xlsx");
			wb=new XSSFWorkbook(fin);
			int shcount=wb.getNumberOfSheets();
			for(int s=0;s<shcount;s++)
			{
				String sheetname=wb.getSheetName(s);
				System.out.println(sheetname);
				sh=wb.getSheet(sheetname);
				
				
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
