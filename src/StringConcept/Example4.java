package StringConcept;

public class Example4 {
	
	public static void main(String[] args) {
		
		String s1="OBRDR";
		String s2="OBRDR";
		
		/* both s1 and s2 storing in pool area 
		 * address of s1 s2  will be same  like address 101 apply for both object
		 * 
		 * 
		 */
		System.out.println(s1==s2);      // true      //101==101
		System.out.println(s1.equals(s2));
		
	}

}
