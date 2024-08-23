package StringProgram;


import java.util.Arrays;

import Superkey.*;


public class AnagramProgram {
	
//	public void m1() {
//		
//		Parentclass_superkey obj=new Parentclass_superkey();
//		  String a=obj.a;
//		  boolean result=false;
//		  
//		  if (!result) {
//			  System.out.println("flag is false");
//		  }
//		 
//	}
	
	
	
	
	public static void main(String[] args) {
		
	
	
	  String str1="garb";
	  String str2="garb";
	  
	 str1=str1.toLowerCase();
	 str2=str2.toLowerCase();
	 
	 if(str1.length()!=str2.length()) {
		 
		 System.out.println("This is not anagram");
	 }else {
		 
		 char[] a=str1.toCharArray();
		 char[]b=str1.toCharArray();
		 
		 Arrays.sort(a);
		 Arrays.sort(b);
		 if(Arrays.equals(a, b)==true) {
			 
			 System.out.println("This is anagram number");
			 
		 }
	 }
	
	
	
	
}
	
}
