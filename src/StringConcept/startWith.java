package StringConcept;

public class startWith {
	
	// main method  
	public static void main(String args[])  
	{    
	// input string  
	String s1="java string split method by javatpoint";    
	System.out.println(s1.startsWith("ja"));  // true  
	System.out.println(s1.startsWith("java string"));   // true  
	System.out.println(s1.startsWith("Java string"));  // false as 'j' and 'J' are different
	
	char a='7';
	
	int u='5';
	char y=(char)u;
	
	int z=(int)a;
	System.out.println(y);
	}  

}
