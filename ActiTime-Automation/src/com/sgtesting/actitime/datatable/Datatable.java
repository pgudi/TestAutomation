package com.sgtesting.actitime.datatable;

import java.io.FileInputStream;
import java.util.Calendar;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datatable {
	public static Workbook wb=null;
	/**
	 * Testcase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Return Value:
	 * Parameters:
	 * Modified Date:
	 * Purpose:
	 * Description:
	 */
	public int rowCount(String filename,String sheetname)
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		int rowcount=0;
		try
		{
			fin=new FileInputStream(filename);
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet(sheetname);
			if(sh==null)
			{
				return -1;
			}
			rowcount=sh.getPhysicalNumberOfRows();
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
				sh=null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return rowcount-1;
	}

	/**
	 * Testcase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Return Value:
	 * Parameters:
	 * Modified Date:
	 * Purpose:
	 * Description:
	 */
	public boolean importExcelFile(String filename)
	{
		FileInputStream fin=null;
		boolean isFileLoaded=false;
		try
		{
			fin=new FileInputStream(filename);
			wb=new XSSFWorkbook(fin);
			if(wb!=null)
			{
				isFileLoaded=true;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return isFileLoaded;
	}
	/**
	 * Testcase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Return Value:
	 * Parameters:
	 * Modified Date:
	 * Purpose:
	 * Description:
	 */
	public int rowCount(String sheetname)
	{
		Sheet sh=null;
		int rowcount=0;
		try
		{
			sh=wb.getSheet(sheetname);
			if(sh==null)
			{
				return -1;
			}
			rowcount=sh.getPhysicalNumberOfRows();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

		return rowcount-1;
	}

	/**
	 * Testcase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Return Value:
	 * Parameters:
	 * Modified Date:
	 * Purpose:
	 * Description:
	 */
	public String getCellData(String FileName,String SheetName,String colName,int rownum)
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		String strCellData=null;
		int colNum=0;
		try
		{
			fin=new FileInputStream(FileName);
			wb=new XSSFWorkbook(fin);
			if (wb ==null)
			{
				return null;
			}
			sh=wb.getSheet(SheetName);
			if (sh==null) 
			{
				return null;
			}
			row=sh.getRow(0);
			for (int c=0;c<row.getPhysicalNumberOfCells();c++)
			{
				cell=row.getCell(c);
				String ColumnValue=cell.getStringCellValue();
				if (ColumnValue.trim().equalsIgnoreCase(colName.trim()))
				{
					colNum=c;
					break;
				}
			}
			row=sh.getRow(rownum-1);
			cell=row.getCell(colNum);
			if (cell==null || cell.getCellType()==cell.getCellType().BLANK)
			{
				strCellData="";
			}
			else if(cell.getCellType()==cell.getCellType().STRING)
			{
				strCellData=cell.getStringCellValue();
			}
			else if(cell.getCellType()==cell.getCellType().BOOLEAN)
			{
				strCellData=String.valueOf(cell.getBooleanCellValue());
			}
			else if(cell.getCellType()==cell.getCellType().NUMERIC)
			{
				if (DateUtil.isCellDateFormatted(cell))
				{
					double d=cell.getNumericCellValue();
					Calendar cal=Calendar.getInstance();
					cal.setTime(DateUtil.getJavaDate(d));
					int month=cal.get(Calendar.MONTH)+1;
					int day=cal.get(Calendar.DAY_OF_MONTH);
					int year=cal.get(Calendar.YEAR);
					String sDate=month+"/"+day+"/"+year;
					strCellData=sDate;
				}
				else
				{
					strCellData=String.valueOf(cell.getNumericCellValue());
				}
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
		return strCellData;
	}
	
	/**
	 * Testcase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Return Value:
	 * Parameters:
	 * Modified Date:
	 * Purpose:
	 * Description:
	 */
	public String getCellData(String SheetName,String colName,int rownum)
	{
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		String strCellData=null;
		int colNum=0;
		try
		{
			sh=wb.getSheet(SheetName);
			if (sh==null) 
			{
				return null;
			}
			row=sh.getRow(0);
			for (int c=0;c<row.getPhysicalNumberOfCells();c++)
			{
				cell=row.getCell(c);
				String ColumnValue=cell.getStringCellValue();
				if (ColumnValue.trim().equalsIgnoreCase(colName.trim()))
				{
					colNum=c;
					break;
				}
			}
			row=sh.getRow(rownum-1);
			cell=row.getCell(colNum);
			if (cell==null || cell.getCellType()==cell.getCellType().BLANK)
			{
				strCellData="";
			}
			else if(cell.getCellType()==cell.getCellType().STRING)
			{
				strCellData=cell.getStringCellValue();
			}
			else if(cell.getCellType()==cell.getCellType().BOOLEAN)
			{
				strCellData=String.valueOf(cell.getBooleanCellValue());
			}
			else if(cell.getCellType()==cell.getCellType().NUMERIC)
			{
				if (DateUtil.isCellDateFormatted(cell))
				{
					double d=cell.getNumericCellValue();
					Calendar cal=Calendar.getInstance();
					cal.setTime(DateUtil.getJavaDate(d));
					int month=cal.get(Calendar.MONTH)+1;
					int day=cal.get(Calendar.DAY_OF_MONTH);
					int year=cal.get(Calendar.YEAR);
					String sDate=month+"/"+day+"/"+year;
					strCellData=sDate;
				}
				else
				{
					strCellData=String.valueOf(cell.getNumericCellValue());
				}
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return strCellData;
	}
	public static void main(String[] args) {
		Datatable obj=new Datatable();

		String path=System.getProperty("user.dir");
		String filename=path+"\\Controller\\data_Controller.xlsx";
		String val=obj.getCellData(filename, "Scenarios", "DOJ", 4);
		System.out.println(val);
	}

}
