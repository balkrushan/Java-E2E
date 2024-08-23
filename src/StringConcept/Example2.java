package StringConcept;

public class Example2 {
	
	public static void main(String[] args) {
		 
		String s1= new String("OBRDR");
		String s2= new String("OBEM");
		
		s2=s1;   //  s2 value assigned to s1  means s2=OBRDR
		
		System.out.println(s1==s2);       // true
		System.out.println(s1.equals(s2)); // true
		
		
	}

}
