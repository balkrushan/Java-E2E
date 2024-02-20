package Synchronization;
import java.util.ArrayList;
import java.util.List;

public class NonSynchronizedArrayListExample {
	
	
	/* 1. If multiple 
	 * 2. Array list is not thread safe. multiple executions is not possible.
	 * 3. If multiple thread attempts to modify the "Arraylist" concurrently then inconsistency , race condition, other issue will occurre.
	 * 4. But we can make arraylist is thread-safe , by using external synchronization.  need to use this method  Collections.synchronizedList():
	 * 
	 * 
	 */
    public static void main(String[] args) {
        // Creating a non-synchronized ArrayList
        List<Integer> arrayList = new ArrayList<>();

        // Creating two threads that concurrently add elements to the ArrayList
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                arrayList.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                arrayList.add(i);
            }
        });

        // Starting both threads
        thread1.start();
        thread2.start();

        // Waiting for both threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing the size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());
    }
}


