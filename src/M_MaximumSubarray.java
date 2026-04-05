// Day 5- 26th of March 2026 - Prob #13


public class M_MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Result: " + maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int current = 0, maximum = Integer.MIN_VALUE;

        for (int num : nums) {
            current = Math.max(num, current + num);
            maximum = Math.max(current, maximum);
        }

        return maximum;
    }
}
