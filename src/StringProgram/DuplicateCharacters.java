package StringProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {
	
	public static void removeDuplicateChar() {
		
		String str="bibibibixyzxyz";
		
		int a =str.length();
		
		
	
		
		HashSet<Character> duplicate= new HashSet<>();
		
		
		for(int i=0; i<a; i++) {
			

			for(int j=i+1; j<a;j++)
			{
				if(str.charAt(i)==str.charAt(j)) {
					
					duplicate.add(str.charAt(i));
					
				  break;
				}
				
			}
			
			}
		
		
		for(char z:duplicate) {
			System.out.print(z);
			
			
		}
		 System.out.println(duplicate.size());
	}
	
	public static void main(String[] args) {
		
		removeDuplicateChar();
	}

}
