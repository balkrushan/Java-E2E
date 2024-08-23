package Collection;

import java.util.HashMap;

public class Hasmap {
	
	public static void main(String[] args) 
	{
		
		// map is not allow duplicate key , value can be duplicate.
		// map is not maintaning  insertion order
		// it is storing key and value pair 
		
		//the map can have any number of null values, but only up to one null key.
		
	HashMap<String,Integer > a= new HashMap<String ,Integer>();
	a.put("a", 100);
	a.put("b", 200);
	a.put("b", 200);
	a.put(null, 200);   //the map can have any number of null values, but only up to one null key.
	a.put(null,625);
	
	System.out.println(a);
		
		
		
	}

}
