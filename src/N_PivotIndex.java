// Day 5- 26th of March 2026 - Prob #12

public class N_PivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println("Result: " + pivotIndex(arr));
    }

    public static int pivotIndex(int[] nums) {
        int total = 0, leftSum = 0;

        for (int num : nums) {
            total += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == total - nums[i] - leftSum)
                return i;
            leftSum += nums[i];
        }

        return -1;
    }
}
