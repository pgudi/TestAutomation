package com.sgtesting.reflection5;

import java.lang.reflect.Method;

public class SampleDemo {
	public static void main(String[] args) {
		executeTests();
	}

	static void executeTests()
	{
		Sample obj=new Sample();
		try
		{
			Class strParam[]=new Class[1];
			strParam[0]=String.class;
			
			Method m1=obj.getClass().getMethod("displayFN", strParam);
			m1.invoke(obj, new String("DemoUser1"));
			
			Class strParam1[]=new Class[2];
			strParam1[0]=String.class;
			strParam1[1]=String.class;
			
			Method m2=obj.getClass().getMethod("addressDetails", strParam1);
			m2.invoke(obj, new String("Bangalore"),new String("Karnataka"));
			
			Class intParam[]=new Class[1];
			intParam[0]=Integer.TYPE;
			
			Method m3=obj.getClass().getMethod("showAge", intParam);
			m3.invoke(obj, 15);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
