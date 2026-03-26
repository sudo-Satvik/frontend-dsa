// Day 5- 26th of March 2026 - Prob #11

import java.util.HashMap;

public class L_SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println("Result: " + subarraySum(arr, 3));
    }

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0, sum = 0;
        map.put(0, 1);
        for (int num : nums) {
            // storing prefix sum
            sum += num;
            // previous = curr - k
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
