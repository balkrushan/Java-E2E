package StringConcept;

public class Example1 {
	
	static String s1= new String("OBRDR");   // store in Heap Area and constant pool  . obj =s1  address=101
	static  String s2= new String("OBRDR");   // store in Heap area and constant pool.  obj =s2  address=102
	
	public static void main(String[] args) {
		System.out.println(s1==s2);           // false         // false due to Stored address are different  101 ==102
		System.out.println(s1.equals(s2));    // true           
		
	}
	
	
	

}
