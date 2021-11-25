package com.sgtesting.actitime.driverscript;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import com.sgtesting.actitime.datatable.Datatable;
import com.sgtesting.actitime.tests.Initialization;

public class DriverScript {
	public static String strPath=null;
	public static WebDriver oBrowser=null;
	public static Datatable datatable=null;
	public static String strControllerFileName=null;
	public static void main(String[] args) {
		
		try
		{
			strPath=System.getProperty("user.dir");
			datatable=new Datatable();
			strControllerFileName=strPath+"\\Controller\\data_Controller.xlsx";
			int iControllerRowCount=datatable.rowCount(strControllerFileName, "Scenarios");
			for(int tcid=0;tcid<iControllerRowCount;tcid++)
			{
				String testcaseid=datatable.getCellData(strControllerFileName, "Scenarios", "TestcaseID", tcid+2);
				String testcasename=datatable.getCellData(strControllerFileName, "Scenarios", "TestcaseName", tcid+2);
				String testdescription=datatable.getCellData(strControllerFileName, "Scenarios", "Description", tcid+2);
				String runstatus=datatable.getCellData(strControllerFileName, "Scenarios", "RunStatus", tcid+2);
				System.out.println("testcaseid :"+testcaseid);
				System.out.println("testcasename :"+testcasename);
				System.out.println("testdescription :"+testdescription);
				System.out.println("runstatus :"+runstatus);
				
				if(runstatus.equalsIgnoreCase("yes"))
				{
					oBrowser=Initialization.launchBrowser();
					
					Class driverparam[]=new Class[1];
					driverparam[0]=WebDriver.class;
					
					String testScriptDataFile=strPath+"\\TestScriptDataFiles\\"+testcasename+".xlsx";
					int testScriptRowCount=datatable.rowCount(testScriptDataFile, testcaseid);
					for(int tsid=0;tsid<testScriptRowCount;tsid++)
					{
						String testscriptid=datatable.getCellData(testScriptDataFile, testcaseid, "TestScriptID", tsid+2);
						String testscriptdesc=datatable.getCellData(testScriptDataFile, testcaseid, "Description", tsid+2);
						String testmethodname=datatable.getCellData(testScriptDataFile, testcaseid, "MethodName", tsid+2);
						String testpkgclass=datatable.getCellData(testScriptDataFile, testcaseid, "PackageClassName", tsid+2);
						
						System.out.println("testscriptid :"+testscriptid);
						System.out.println("testscriptdesc :"+testscriptdesc);
						System.out.println("testmethodname :"+testmethodname);
						System.out.println("testpkgclass :"+testpkgclass);
						
						Class classObject=Class.forName(testpkgclass);
						Object object=classObject.getDeclaredConstructor().newInstance();
						
						Method method=object.getClass().getMethod(testmethodname, driverparam);
						
						method.invoke(object, oBrowser);
					}
				}
			}
			System.out.println("++++++++++++++++++++++++++++++");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
