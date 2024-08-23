package com.jci.java.practice1;

import AccessSpecifier.*;

public class protectedExamples  {
	
	public static void main(String[] args) {
		
		// 1. access level of protected keyword is within the pkg. 
		 
		
		 String a=Protectedkeyword.msg;   // msg variable declare as protected that's why its not accessible outside the pkg.
		 System.out.println(a);
		 
		// 1. access level of Default keyword is within the pkg. 
		 
		String b= Protectedkeyword.msg1; // msg1 variable declare as Default(no Accessspecifier) that's why its not accessible outside the pkg.
	}
	
	
	
	

}



