package StringProgram;

import java.util.HashSet;
import java.util.Iterator;

public class DuplicateString {
	
	public static void duplicateWorld() {
	
	String str1="Big black bug bit a big black dog on his big black nose";
  String str2=str1.toLowerCase();
 String [] arr= str2.split(" ");
 
 HashSet<String> duplicate =new HashSet<>();
  for(int i=0; i<arr.length;i++)
  {
	 for(int j=i+1; j<arr.length; j++) {
		  
		 if(arr[i].equals(arr[j])) {
			String d=arr[i] ;
            duplicate.add(d);
            break;
		 
	  }
  }
  
  for(String a :duplicate) {
	  
	  System.out.println(a);
  }
 
	}
	
	 public static void main (String[]args) {
		 
		 duplicateWorld();
     }

}
