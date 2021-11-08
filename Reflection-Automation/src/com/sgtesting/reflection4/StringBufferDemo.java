package com.sgtesting.reflection4;

public class StringBufferDemo {
	
	public void appendDemo()
	{
		StringBuffer s=new StringBuffer("Java");
		System.out.println(s);
		s.append(" Programming");
		System.out.println(s);
		System.out.println("++++++++++++");
	}
	
	public void insertDemo()
	{
		StringBuffer s=new StringBuffer("It is a palace");
		StringBuffer s1= s.insert(8, "new ");
		System.out.println("Insertd String :"+s1);
		System.out.println("++++++++++++");
	}
	
	public void deleteDemo()
	{
		StringBuffer s=new StringBuffer("It is a new palace");
		StringBuffer s1= s.delete(8, 12);
		System.out.println("Deleted String :"+s1);
		System.out.println("++++++++++++");
	}
	
	public void reverseDemo()
	{
		StringBuffer s=new StringBuffer("Programming");
		StringBuffer s1=s.reverse();
		System.out.println("Reversed String :"+s1);
	}

}
