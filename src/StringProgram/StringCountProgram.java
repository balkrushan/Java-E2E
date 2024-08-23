package StringProgram;

public class StringCountProgram {
	
	static String string="The best of both worlds";
	
	public static void main(String[] args) {
		int count=0;
		int sCount=0;
		
		//////// First way ////////////
		
		for(int i=0; i<= string.length()-1; i++) {
			    if (string.charAt(i)!= ' ') {
			    	count++;
			    	
			    }
			    
			    
			    	
		
			
		}
		
		////////Second Way //////////
		
		for (int j=0; j<string.length(); j++) {
			
			if(string.charAt(j)==' ') {
				continue;
				
			}
			sCount++;
			
			
			
		}
		System.out.println("Count of string is :" + count);
		System.out.println("Count of string is :" + sCount);
		
	}
	
	

}
