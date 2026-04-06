// Day 11 - 6th of April 2026 - Prob #22

public class W_MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        System.out.println("Result: " + findMaxAverage(arr, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            max = Math.max(sum, max);
        }

        return (double) max / k;
    }
}
