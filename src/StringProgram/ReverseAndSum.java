package StringProgram;

public class ReverseAndSum {
	
	
	    public static void main(String[] args) {
	        int number = 12536987;
	        
	        // Reverse the number
	        int reversedNumber = reverseNumber(number);
	        
	        // Calculate the sum of digits
	        int sumOfDigits = sumOfDigits(reversedNumber);
	        
	        System.out.println("Reversed Number: " + reversedNumber);
	        System.out.println("Sum of Digits: " + sumOfDigits);
	    }
	    
	    // Function to reverse an integer
	    public static int reverseNumber(int num) {
	        int reversedNum = 0;
	        while (num != 0) {
	            int digit = num % 10;
	            reversedNum = reversedNum * 10 + digit;
	            num /= 10;
	        }
 	        return reversedNum;
	    }
	    
	    // Function to calculate the sum of digits
	    public static int sumOfDigits(int num) {
	        int sum = 0;
	        while (num != 0) {
	            int digit = num % 10;
	            sum += digit;
	            num /= 10;
	        }
	        return sum;
	    }
	}



