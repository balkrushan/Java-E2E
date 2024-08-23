package numberProgram;


	
	import java.util.*;

	public class PrimeChecker {
	    
	    // Function to check if a number is prime
	    public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        if (n <= 3) {
	            return true;
	        }
	        if (n % 2 == 0 || n % 3 == 0) {
	            return false;
	        }
	        for (int i = 5; i * i <= n; i = i + 6) {
	            if (n % i == 0 || n % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    
	    // Function to generate permutations of a number's digits
	    public static List<String> generatePermutations(String num) {
	        List<String> result = new ArrayList<>();
	        generate(num.toCharArray(), 0, result);
	        return result;
	    }
	    
	    private static void generate(char[] arr, int index, List<String> result) {
	        if (index == arr.length - 1) {
	            result.add(new String(arr));
	        } else {
	            for (int i = index; i < arr.length; i++) {
	                swap(arr, index, i);
	                generate(arr, index + 1, result);
	                swap(arr, index, i); // backtrack
	            }
	        }
	    }
	    
	    private static void swap(char[] arr, int i, int j) {
	        char temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	    
	    // Function to check if any permutation of num is prime
	     public static int primeChecker(int num) {
	        String numStr = Integer.toString(num);
	        List<String> permutations = generatePermutations(numStr);
	        
	        for (String perm : permutations) {
	            int permInt = Integer.parseInt(perm);
	            if (isPrime(permInt)) {
	                return 1; // Found a prime permutation
	            }
	        }
	        
	        return 0; // No prime permutation found
	    }
	    
	    public static void main(String[] args) {
	        int num =598;
	        int result = primeChecker(num);
	        
	        if (result == 1) {
	            System.out.println("1");
	        } else {
	            System.out.println("0");
	        }
	    }
	}



