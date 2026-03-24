// Day 5- 24th of March 2026 - Prob #10

import java.util.*;

public class J_MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println("Result: " + majorityElement(arr));
        System.out.println("Result Optimised: " + majorityElementOptimised(arr));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int threshold = nums.length / 2;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > threshold) return entry.getKey();
        }

        return -1;
    }

    // By using Boyer-Moore Voting Algorithm
    public static int majorityElementOptimised(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) candidate = num;

            if (num == candidate) count++;
            else count--;
        }

        return candidate;
    }
}
