package concept_learnt;

import java.util.*;

// Learnt from Top K Frequency Elements problem, practicing here

public class C_PriorityQueuesHeap {
    public static void main(String[] args) {

        // Default one - min heap =============================
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        //adding the elements in the pq
        minHeap.add(12);
        minHeap.add(3);
        minHeap.add(4);
        minHeap.add(7);
        minHeap.add(2);
        minHeap.add(1);

        System.out.println("Priority Queue: " + minHeap);

        // removing the elements from the minHeap
        System.out.println("Return of remove(): " +  minHeap.remove());
        System.out.println("Priority Queue removed: " + minHeap);

        // just checking the top element
        System.out.println("Return of peek(): " + minHeap.peek());
        System.out.println("Priority Queue after peek(): " + minHeap);

        // removing top element and returning the same
        System.out.println("Return of poll(): " + minHeap.poll());
        System.out.println("Priority Queue after poll(): " + minHeap);

        // size of poll
        System.out.println("Size of minHeap: " + minHeap.size());

        // is the Priority Queue is empty
        System.out.println("Is Priority Queue empty: " + minHeap.isEmpty());


        // Max Heap ====================================================================
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(12);
        maxHeap.add(3);
        maxHeap.add(4);
        maxHeap.add(7);
        maxHeap.add(2);
        maxHeap.add(1);

        System.out.println("Top element of this max heap priority queue is: " + maxHeap.peek());
    }
}
