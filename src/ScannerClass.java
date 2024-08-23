import java.util.Scanner;

public class ScannerClass {
	
	public static String entername(String name) {
		return name;
		
	}
      public static void main(String[] args) {
    	  
    	  Scanner scanner =new Scanner(System.in);
    	  System.out.println("Please enter string name>>");
    	  String name= scanner.next();
    	  System.out.println("Please enter string line>>");
    	  String line=scanner.nextLine();
    	  
    	  System.out.println("entered String name is :"+ name+ line);
    	  
    	  
		
	}
}
