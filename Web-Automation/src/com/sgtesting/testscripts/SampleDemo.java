package com.sgtesting.testscripts;

import java.io.File;

public class SampleDemo {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.out.println(path);
		File f1=new File(path+"\\Logs\\logigng.log");
		
		boolean val=f1.isFile();
		System.out.println(val);

	}

}
