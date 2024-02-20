package StringProgram;

import java.util.Arrays;

import Superkey.*;


public class AnagramProgram {
	
	public void m1() {
		
		Parentclass_superkey obj=new Parentclass_superkey();
		  String a=obj.a;
		  boolean result=false;
		  
		  if (!result) {
			  System.out.println("flag is false");
		  }
		 
	}
	
	
	
	
	public static void main(String[] args) {
		
	
	
	  String str1="garb";
	  String str2="bpag";
	  
	  str1=str1.toLowerCase();
	  str2=str2.toLowerCase();
	
	
	
	if (str1.length()!=str2.length()) {
		System.out.println("both Strings are not anagram");
		
	}else {
		char[]String1=str1.toCharArray();
		char[]String2=str2.toCharArray();
		Arrays.sort(String1);
		Arrays.sort(String2);
		
		if (Arrays.equals(String1, String2)==true) {
			System.out.println(" both string are anagram");
			
		}else {
			System.out.println("Both strings are not anagram..");
		}
		
	}

}
	
}
