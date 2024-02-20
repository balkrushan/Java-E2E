package AccessSpecifier;

public class Privatenestedclass {           //Class can't be private 
	
//	A class cannot be private or protected except nested class.
	
	    private class PrivateInnerClass {             //   nested class can be private    
	    	
	        public static void displayMessage() {    
	        	
	            System.out.println("Hello from PrivateInnerClass!");
	        }
	    

	    }
	    
	    public static void main(String[] args) {
			
	    	Privatenestedclass.PrivateInnerClass.displayMessage();
		}
}
