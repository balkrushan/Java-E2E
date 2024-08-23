package StringConcept;

public class Split {
	
	public static void main(String[] args) {
		
		String s="Welcome to java world aa";
		
		String a[]=s.split("\\s",3); // size of will decide 2nd argument 
		
		for(String b:a) {
			System.out.println(b);
		}
		
	}
	
	
	
	

}
