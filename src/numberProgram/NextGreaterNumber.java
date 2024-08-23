package numberProgram;

import java.util.Arrays;
import java.util.Scanner;

public class NextGreaterNumber {
    
    public static int nextGreaterNumber(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        
        // Step 1: Find the first decreasing digit from the right
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }
        
        // If no such digit is found, the number is the largest possible permutation
        if (i == -1) {
            return num;
        }
        
        // Step 2: Find the smallest digit on the right side of digits[i] that is larger than digits[i]
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }
        
        // Step 3: Swap digits[i] and digits[j]
        swap(digits, i, j);
        
        // Step 4: Reverse the sequence from digits[i+1] to the end
        reverse(digits, i + 1, digits.length - 1);
        
        // Convert char array back to integer
        return Integer.parseInt(new String(digits));
    }
    
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
    	
    	Scanner s= new Scanner(System.in);
    	int a=s.nextInt();
    	System.out.println(nextGreaterNumber(a));
    	
    }
}
