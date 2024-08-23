package StringProgram;

public class reverseStr {
	
	public static void reverse(String str) {
	
	
	   int lght=str.length();
	
	for(int i=lght-1; i>=0; i--) {
		
		char a=str.charAt(i);
		System.out.print(a);
		
	}
	
	}
	
	public static void main(String[]args)
	{
		reverse("balkrushan sirsakar");
	}
}
