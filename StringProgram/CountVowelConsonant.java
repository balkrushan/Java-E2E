package StringProgram;

public class CountVowelConsonant {
	
	public static void main(String[] args) {
		 
		String str2="This is a rEally simple sentence";
		       String str=str2.toLowerCase();
		String str1="aeiou";
		int spaceCount=0;
		
		int sizestr=str.length();
		
		int vowelCount=0;
		
		
		
		
		for(int i=0; i<str.length(); i++ ) {
			if (str.charAt(i)==' ') {
				spaceCount++;
			}
			for(int j=0; j<str1.length(); j++) {
				if (str.charAt(i)==str1.charAt(j)) {
			    vowelCount++;
				}
				
				
			
				
			}
		}
		
		int consonantCount=sizestr-(vowelCount+spaceCount);
		System.out.println("vowelCount:" +vowelCount );
		System.out.println("consonantCount:" +consonantCount );
		
		
		
		
		
		
		
		
		
		////////////// 2nd option //////////
		
		
		   int vCount = 0, cCount = 0;    
           
	        //Declare a string    
	        String Str = "This is a really simple sentence";    
	            
	        //Converting entire string to lower case to reduce the comparisons    
	        Str = Str.toLowerCase();    
	            
	        for(int i = 0; i < Str.length(); i++) {    
	            //Checks whether a character is a vowel    
	            if(Str.charAt(i) == 'a' || Str.charAt(i) == 'e' || Str.charAt(i) == 'i' || Str.charAt(i) == 'o' || Str.charAt(i) == 'u') {    
	                //Increments the vowel counter    
	                vCount++;    
	            }    
	            //Checks whether a character is a consonant    
	            else if(Str.charAt(i) >= 'a' && Str.charAt(i)<='z') {      
	                //Increments the consonant counter    
	                cCount++;    
	            }    
	        }    
	        System.out.println("Number of vowels: " + vCount);    
	        System.out.println("Number of consonats: " + cCount);
	}

}
