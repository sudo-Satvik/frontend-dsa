// Day 10 - 5th of April 2026 - Prob #19

import java.util.Arrays;

public class S_MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12,0,-1};

        System.out.println("Before operation: " + Arrays.toString(arr));

        moveZeroes(arr);

        System.out.println("After operation: " + Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums) {
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;

                slow++;
            }
        }
    }
}
