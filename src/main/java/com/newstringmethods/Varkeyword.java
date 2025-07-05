package com.newstringmethods;

interface Cal{
	int sum(int a, int b);
}

public class Varkeyword {

	public static void main(String[] args) {
		
		// In java 11
	Cal	cla= (var a,var b)-> a+b;
	System.out.println(cla.sum(8, 5));
	
	// Java 8
	Cal	cla1= ( a, b)-> a+b;
	System.out.println(cla1.sum(81, 5));
	
	// Java 8
		Cal	cla3= ( int a,int  b)-> a+b;
		System.out.println(cla3.sum(7, 5));
		
		//(var s1, s2) -> s1 + s2 //no skipping allowed
		//(var s1, String y) -> s1 + y //no mixing allowed

	//	var s1 -> s1 //not allowed. Need parentheses if you use var in lambda.

	}
}
