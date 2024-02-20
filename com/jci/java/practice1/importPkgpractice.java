package com.jci.java.practice1;

import com.jci.mars.practice2.*;

/// pkg are the collection of classes and interface.
// using import keyword we can use class of another pkg.


public class importPkgpractice extends importPkgtestpractice {
	
	public static void m1() {
		
		System.out.println("Class B m1() method");
	}
	
	public static void main(String[] args) {
		
	importPkgtestpractice test=new importPkgtestpractice();
		test.m1();
		m1();
		
		importPkgpractice test2=new importPkgpractice();
		
		
		
		
	}
	
	
	
	
	

}
