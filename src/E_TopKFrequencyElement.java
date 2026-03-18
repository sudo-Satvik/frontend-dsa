// Day 3- 18th of March 2026 - Prob #5

import java.util.*;

public class E_TopKFrequencyElement {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k = 2;
        System.out.println("Result: " + Arrays.toString(topKFrequent(arr, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        // used hashmap for storing frequency of nums value
        HashMap<Integer, Integer> map = new HashMap<>();

        // used priority queue for avoiding the sorting
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        // used in returning the answer
        int[] res = new int[k];

        // storing frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // storing number and frequency pair aka (x, y) in pq
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // adding in the priority queue
            pq.add(entry);
            // limiting the size of pq till k
            if (pq.size() > k)
                pq.poll();  // remove the smallest value
        }

        // storing the key of Map Entry to array and returning it as answer
        for (int i = k - 1; i >= 0; i--) {
            res[i] = pq.poll().getKey();
        }
        return res;
    }
}
