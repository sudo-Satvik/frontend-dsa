// Day 1 - 16th of March 2026 - Prob #1

import java.util.*;

public class A_TwoSum {
    public static void main (String[] args) {
        int[] arr = {2,5,5,11};
        int target = 10;

        System.out.println("Result: " + Arrays.toString(twoSumBruteforce(arr, target)));
    }
    public static int[] twoSumBruteforce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j =  i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[] {i, j};
            }
        }
        return new int[] {-1, -1};
    }

    public static int[] twoSumUsingHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement))
                return new int[] {map.get(complement), i};
            map.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}
