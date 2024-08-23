package Wrapperclass;

public class Integr {
	
	/* below are the wrapper classes
	 * Interger
	 * Boolean
	 * Double
	 * Short
	 * Long 
	 * Float
	 * 
	*/
	public static void main(String[] args) {
		
	
	// For example, when you have an int primitive and you assign it to an Integer variable, 
	// autoboxing automatically converts the int primitive into an Integer object:
	
	int primitiveInt = 10;
	Integer objectInt = Integer.valueOf(primitiveInt); // Autoboxing - primitiveInt is automatically converted to an Integer object

	System.out.println(objectInt);
	
	
	//  Similarly, unboxing is the process of converting an object back into its corresponding primitive data type. For example:
	
	Integer objectInt1 = 20;
	int primitiveIntt = objectInt1; // Unboxing - objectInt is automatically converted to an int primitive
	
	@SuppressWarnings("removal")
	Integer a= new Integer(3);
	System.out.println(a.intValue()); // here converting objective to premitive data type called as un-boxing 
	
	}
}
