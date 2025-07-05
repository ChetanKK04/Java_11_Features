package com.newstringmethods;

import java.util.stream.Stream;

public class NewStringMethods {

	public static void main(String[] args) {
		String s = "chetan";
		String s1 = "" ;
	  
		// isBlank()	
	boolean c=	s.isBlank();
	boolean	c1=	s1.isBlank();
	//System.out.println(c);
	//System.out.println(c1);
	
	// lines()
	
	String str = "Studytonight \n  is a \r technical \n portal"; 
	
	Stream<String> ss= str.lines();
	//ss.forEach(System.out::println);
	
	String str1 = "      Studytonight portal  1    "; 
	System.out.println(str1);
    String str2 = str1.strip();
   // System.out.println(str2);
    
    String str3 = str1.stripLeading();
    System.out.println(str3);
    
    
    String str4 = str1.stripTrailing();
    System.out.println(str4);
	
    String ss1 = "@"; 
	System.out.println(ss1);
	String sss = ss1.repeat(3);
	System.out.println(sss);
	
	
	}
}
