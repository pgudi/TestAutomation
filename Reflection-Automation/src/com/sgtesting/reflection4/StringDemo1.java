package com.sgtesting.reflection4;

public class StringDemo1 {
	
	public void strLength()
	{
		String s=new String("Programming");
		int v1=s.length();
		System.out.println("# of Chars:"+v1);
		System.out.println("++++++++++++++++");
	}

	public void emptyString()
	{
		String s=new String();
		boolean b=s.isEmpty();
		System.out.println("Is the String is Empty ?:"+b);
		System.out.println("++++++++++++++++");
	}
	
	public void getCharacter()
	{
		String s=new String("PROGRAM");
		char ch=s.charAt(3);
		System.out.println("Character :"+ch);
		System.out.println("++++++++++++++++");
	}
	
	public void lowercase()
	{
		String s="PROGRAM";
		String s1=s.toLowerCase();
		System.out.println("LowerCase :"+s1);
		System.out.println("++++++++++++++++");
	}
	
	public void uppercase()
	{
		String s="program";
		System.out.println("UpperCase :"+s.toUpperCase());
		System.out.println("++++++++++++++++");
	}
	public void strExtractingDemo()
	{
		String s="Programming";
		String s1=s.substring(3);
		System.out.println("Extract 1:"+s1);
		String s2=s.substring(3, 7);
		System.out.println("Extract 2:"+s2);
		System.out.println("++++++++++++++++");
	}
	
	public void stringcompare1()
	{
		String s1="JavaScript";
		String s2="JAVASCRIPT";
		System.out.println("s1 and s2 are equal :"+(s1.equals(s2)));
		System.out.println("Ignore Case,s1 and s2 are equal :"+(s1.equalsIgnoreCase(s2)));
		System.out.println("++++++++++++++++");
	}
	
	public void stringcompare2()
	{
		String s1="JavaScript";
		String s2="JAVASCRIPT";
		System.out.println("s1 and s2 are equal :"+(s1.compareTo(s2)));
		System.out.println("Ignore Case,s1 and s2 are equal :"+(s1.compareToIgnoreCase(s2)));
		System.out.println("++++++++++++++++");
	}
	
	public void existanceOfString()
	{
		String s1="Java is a programming language";
		System.out.println("Starts With :"+s1.startsWith("Java"));
		System.out.println("Ends With :"+s1.endsWith("age"));
		System.out.println("Starts With :"+s1.contains("is"));
		System.out.println("++++++++++++++++");
	}
	
	public void convertStringToCharArray()
	{
		String s="Programming";
		char ch[]=s.toCharArray();
		for(char kk:ch)
		{
			System.out.println(kk);
		}
		System.out.println("++++++++++++++++");
	}
	
	public void findPosition()
	{
		String s="xxaxxaxxaXXAXXA";
		System.out.println("Position of A from Left:"+s.indexOf('A'));
		System.out.println("Position of A from Right:"+s.lastIndexOf('A'));
		System.out.println("++++++++++++++++");
	}
	
	public void splitString()
	{
		String s="Apple,Mango,GRapes,Banana,Orange";
		String s1[]=s.split(",");
		for(String k:s1)
		{
			System.out.println(k);
		}
		System.out.println("++++++++++++++++");
	}
	
	public void replaceDemo()
	{
		String s="It is a new Palace";
		System.out.println("Replaced String :"+s.replace("is","was"));
		System.out.println("++++++++++++++++");
	}
	
}
