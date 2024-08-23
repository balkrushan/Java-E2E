package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Hasset {

	
	// has set is class and implementaion of HASh interface 
	// hash set is not maintaining insertion order.
	// its not allow duplicate value.
	//there is only really one null value in the set.
	
	
	
	
	public static void main(String[] args) {
		
	
	HashSet<String> set=new HashSet<>();
	set.add("bala");
	set.add("balaji");
	set.add("Sirsakar");
	set.add("Sirsakar");   // its not allow duplicate value.
	set.add("");          //there is only really one null value in the set.
	set.add("");
	
	System.out.println(set);
	
	
	Iterator it = set.iterator(); 
	
	while(it.hasNext()) {
	
		
		System.out.println(it.next());
		
	}
	
	}
}
