package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SortArraylist {
	
	public static void main(String[] args) {
		
		ArrayList<String> array=new ArrayList<String>();
		array.add("Volkswagen");
		array.add("Toyota");
		array.add("Porsche");
		array.add("Ferrari");
		array.add("Mercedes-Benz");
		array.add("Rolls-Royce");
		
		
		//array.set(0, "balkru");
		Collections.sort(array);
		
		
		for(String a: array) {
			
			System.out.println(a);
		
		}
		
		
	}
	
	

}
