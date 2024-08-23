package Collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListRemovalExample {
    public static void main(String[] args) {
    	
    	
    	
    	
    	
    	
    	
    	/*   main difference bet array list and linked list.
    	 * ArrayList: Uses an array for storing elements, allowing fast random access by index. 
    	 * Good for scenarios where access to elements by index is frequent.
          LinkedList: Uses a doubly linked list, making insertion and removal operations at 
          the beginning or end of the list fast. Suitable for scenarios requiring frequent insertion or removal operations, 
          especially at the beginning or end of the list.
    	 * 
    	 * 
    	 * 
    	 * 
    	 * 
    	 */
    	
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<String>();

        // Adding elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        linkedList.add("Mango");
        
     LinkedList<Integer> linked=new LinkedList<>();
     linked.addFirst(1);
     linked.addFirst(2);
     
     linked.addLast(3);
     linked.addLast(4);
     System.out.println(linked);
        // Original LinkedList
        System.out.println("Original LinkedList: " + linkedList);

        // Finding the index of "Grapes" before removal
        int indexOfGrapesBefore = findIndex(linkedList, "Grapes");

        // Removing the element "Orange"
        linkedList.remove("Orange");

        // Finding the index of "Grapes" after removal
        int indexOfGrapesAfter = findIndex(linkedList, "Grapes");

        // Printing the index of "Grapes" before and after removal
        System.out.println("Index of Grapes before removal: " + indexOfGrapesBefore);
        System.out.println("Index of Grapes after removal: " + indexOfGrapesAfter);
    }

    private static <E> int findIndex(LinkedList<E> list, E element) {
        ListIterator<E> iterator = list.listIterator();
        int index = 0;
        while (iterator.hasNext()) {
            if (iterator.next().equals(element)) {
                return index;
            }
            index++;
        }
        return -1; // Element not found
    }
}


