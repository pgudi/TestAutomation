package com.sgtesting.testscripts;
public class ExecuteAutoITExeFileDemo {
	public static void main(String[] args) {
		executeFile();

	}
	
	static void executeFile()
	{
		try
		{
		//	Runtime.getRuntime().exec("E:\\EXAMPLE\\AutoIT\\SampleTest.exe");
			Runtime runtime=Runtime.getRuntime();
			runtime.exec("E:\\EXAMPLE\\AutoIT\\SampleDemoScript2.exe");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
