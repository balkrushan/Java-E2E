package Synchronization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayListExample {
    public static void main(String[] args) {
        // Creating a synchronized ArrayList
        List<Integer> synchronizedArrayList = Collections.synchronizedList(new ArrayList<>());

        // Creating two threads that concurrently add elements to the synchronized ArrayList
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronizedArrayList.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                synchronizedArrayList.add(i);
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

        // Printing the size of the synchronized ArrayList
        System.out.println("Size of Synchronized ArrayList: " + synchronizedArrayList.size());
    }
}
