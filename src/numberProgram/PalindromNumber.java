package numberProgram;

public class PalindromNumber {
	
	public static void palindrome(int n) {
		
		int temp=n;
		
		int sum=0;
		

	
		while(n!=0) {
			 
			int devident=n%10;
			sum=(sum*10)+devident;
			
			 n=n/10;
		}
	
		System.out.println(sum);
		
		if (temp== sum) {
System.out.println("This is palindrome number");
		} else {
			
			System.out.println("This is not palindrome number");
		}
		
	}
   public static void main(String[]args) {
	   
	   PalindromNumber.palindrome(343);
   }
}
