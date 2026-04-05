// Day 10 - 5th of April 2026 - Prob #20

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T_3Sum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-3};
        System.out.println("Result: " + threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // i duplicate removal
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int start = i + 1, end = nums.length - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[start], nums[end]));

                    // start duplicate removal
                    while (start < end && nums[start] == nums[start + 1])
                        start++;

                    // end duplicate removal
                    while (start < end && nums[end] == nums[end - 1])
                        end--;

                    start++;
                    end--;
                } else if (sum > 0) end--;
                else start++;
            }
        }

        return res;
    }
}
