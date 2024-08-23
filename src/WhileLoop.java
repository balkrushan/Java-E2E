import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;



public class WhileLoop {
	
	
	
	
	// initalization
	//while(Condition)
	//Statement (syso)
	// Increment or decrement operator;
	//Use : when number of iteration is not fixed.
	
	
	public static void ListIteratorExample() {
		ArrayList<String> list=new ArrayList<String>();
				list.add("Balkrushan");
				list.add("Balaji");
		        list.add("Siraskar");
		        
		    Iterator<String> ite    =list.iterator();
		           while(ite.hasNext()) {
		        	   String element=ite.next();
		        	   System.out.println(element);
		           }
		        
				

		}
	
	public static void whileloop() {
		int a=1;                      // Initialized variable
		 while(a<=5) {                // while(condition)
			 
			 System.out.println(a);   // Statement
			 a++;                     // Increment or decrement operator;
			 
		 }
		
	}
	
	public static void main(String[] args) {
		
		WhileLoop.whileloop();
		WhileLoop.ListIteratorExample();
	}

}
