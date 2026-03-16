// Day 1 - 16th of March 2026 - Prob #2

import java.util.*;

public class C_ContainsDuplicate {
    public static void main(String[] args) {
        int[] tc1 = {1,1,1,3,3,4,3,2,4,2};
        int[] tc2 = {1,2,3};
        System.out.println("Result of Test Case: " + containsDuplicate(tc1));
        System.out.println("Result of Test Case: " + containsDuplicate(tc2));
        System.out.println("Result of Test Case: " + containsDuplicateOptimised(tc1));
        System.out.println("Result of Test Case: " + containsDuplicateOptimised(tc2));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int value : map.values()) {
            if (value != 1) return true;
        }

        return false;
    }

    public static boolean containsDuplicateOptimised(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            // find and immediately stop if condition passes
            if (set.contains(num)) return true;
            set.add(num);
        }

        return false;
    }
}
