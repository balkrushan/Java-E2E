package numberProgram;

public class primenumber {   
	static void checkPrime(int n){ 
		
		int m=0; int i=0;
		  
		 m=n/2; int flag=0;
		
		if(n==0 ||n==1) {
			
			System.out.println("This is not prime number");
		}else {
			
			for( i=2; i<=40; i++) {
				if(n%i==0) {
					
					 flag=1;
				}
				
				
				
			}
			
			if(flag==0) {
				System.out.println("Thia is prime number");
			}
			
			if(flag==1) {
				System.out.println("Thia is not prime number");
			}
		}
		
	}
	
		 public static void main(String args[]){    
		  checkPrime(17);  
		 
		} 
		 
}
		 


