// Day 10 - 5th of April 2026 - Prob #18

import java.util.Arrays;

public class R_TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};

        System.out.println("Result: " + Arrays.toString(twoSum(arr, 17)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int sum = nums[start] + nums[end];

            if (sum == target) return new int[]{start + 1, end + 1};
            if (sum > target) end--;
            else start++;
        }
        return new int[]{};
    }
}
