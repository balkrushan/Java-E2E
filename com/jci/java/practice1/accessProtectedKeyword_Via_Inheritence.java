package com.jci.java.practice1;

import AccessSpecifier.Protectedkeyword;

public class accessProtectedKeyword_Via_Inheritence extends Protectedkeyword{
	
	
accessProtectedKeyword_Via_Inheritence p=new accessProtectedKeyword_Via_Inheritence ();
String a=p.color;
	
public static void main(String[] args) {
	
	
//1. if i want to access protected method/variable in other pkg then i can access through inheritance (Scope outside the pkg through inheritance)
	
	
		String b=accessProtectedKeyword_Via_Inheritence.msg;  // here protected variable  is accessible via inheritance
	
	accessProtectedKeyword_Via_Inheritence a2=new accessProtectedKeyword_Via_Inheritence();
	           a2.test();   // here protected method is accessible via inheritance
	          
	
}


		
	}


