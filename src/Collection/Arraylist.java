package Collection;

import java.util.ArrayList;

public class Arraylist {
	
	
public static void main(String[] args) {
	
	// 1. Java ArrayList class can contain duplicate elements.
	// 2. Array list is not synchronized  --> please check synchronized pkg
	// 3. Array list is maintain insertion order
	// 4. Java ArrayList class maintains insertion order" means that when you add elements to an ArrayList, the elements are stored in the order
	//     in which they were inserted.
	//5. Any quantity of null values can be added.
	
	ArrayList <Integer> list=new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(2);
	list.get(0);
	list.add(null);
	list.add(null);
	System.out.println(list.get(0));
	
	
	// Java ArrayList class can contain duplicate elements.
	ArrayList <String> str=new ArrayList<>();
	str.add("Array1");
	str.add("Array1");
	
	for(Integer i:list) {
		
	System.out.println("list value : " + i);	
	
	}
	for(String str2:str) {
		
		System.out.println("list value : " + str2);	
		
		}
	
	// 3. Array list is maintain insertion order.
	ArrayList<String> arraylist=new ArrayList<>();
	arraylist.add("firstindex");
	arraylist.add("secondindex");	
	arraylist.add("3rdindex");
	
	arraylist.remove("secondindex");
	arraylist.add("4thindex");
	
	for(String str1:arraylist) {
		System.out.println(str1);
	}
	
	
	
}

}
