package StringConcept;

public class compareTo {

	
	//CompareTo  is the method it will comapre two string lexicographically(alphabitically).it will return positive , nagative ,0 value 
	
	/* let suppose unicode String a="bala", String c="xyz",  unicode value of B=20 and x=60;
	 * a.compareTo(c)         b=20 < x=60   20-60= -40   method will return -40 value 
	 * 
	 * 
	 * if s1 > s2, it returns positive number  
       if s1 < s2, it returns negative number  
       if s1 == s2, it returns 0  
	 * 
	 * 
	 */
	
	public static void main(String argvs[])  
	{  
	  
	// input string in uppercase  
	String st1 = new String("I");  
	  
	// input string in lowercase  
	String st2 = new String("i");  
	  
	System.out.println(st1.compareTo(st2));  
	
	String a="bala";
	String c="xyz";
	int z=a.compareTo(c);
	System.out.println(z);
	}  
	
}
