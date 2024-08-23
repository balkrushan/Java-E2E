package numberProgram;
public class MakeStringBeautiful {

    public static int minOperationsToMakeBeautiful(String s) {
        int operations = 0;
        int n = s.length();
        
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                operations++;
                i++; // Skip the next character as well since it's the same
            }
        }

        return (operations + 1) / 2; // Rounded up
    }

    public static void main(String[] args) {
        String s = "aabbaa";
        int minOperations = minOperationsToMakeBeautiful(s);
        System.out.println("Minimum number of operations to make the string beautiful: " + minOperations);
    }
}
