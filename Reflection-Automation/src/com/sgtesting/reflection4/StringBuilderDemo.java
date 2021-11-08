package com.sgtesting.reflection4;

public class StringBuilderDemo {
	
	public void appendDemo()
	{
		StringBuilder s=new StringBuilder("Java");
		System.out.println(s);
		s.append(" Programming");
		System.out.println(s);
		System.out.println("++++++++++++");
	}
	
	public void insertDemo()
	{
		StringBuilder s=new StringBuilder("It is a palace");
		StringBuilder s1= s.insert(8, "new ");
		System.out.println("Insertd String :"+s1);
		System.out.println("++++++++++++");
	}
	
	public void deleteDemo()
	{
		StringBuilder s=new StringBuilder("It is a new palace");
		StringBuilder s1= s.delete(8, 12);
		System.out.println("Deleted String :"+s1);
		System.out.println("++++++++++++");
	}
	
	public void reverseDemo()
	{
		StringBuilder s=new StringBuilder("Programming");
		StringBuilder s1=s.reverse();
		System.out.println("Reversed String :"+s1);
	}

}
