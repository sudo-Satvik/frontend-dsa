// Day 12 - 6th of April 2026 - Prob #23

public class X_MinSubArrayLen {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        System.out.println("Result: " + minSubArrayLen(7, arr));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0, left = 0, min = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
