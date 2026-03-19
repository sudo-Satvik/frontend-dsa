// Day 4- 19th of March 2026 - Prob #7

import java.util.*;

public class G_LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println("Result: " + longestConsecutive(arr));
        System.out.println("Result optimised: " + longestConsecutiveOptimised(arr));
    }

    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        int count = 1;
        int max = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                continue;
            }
            else if (nums[i] + 1 == nums[i + 1]) {
                count++;
            }
            else {
                count = 1;
            }

            max = Math.max(max, count);
        }

        return max;
    }


    /**
     * <u>Key Idea:</u>
     * Using a Hash Set to identify sequence starts and counting consecutive elements in linear time.
     */
    public static int longestConsecutiveOptimised(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // storing all the data in the same hashset (set)
        for (int num : nums) {
            set.add(num);
        }

        int res_max = 0;

        // now the main logic or u can say the key idea
        for (int val : set) {
            // agar left element nhi hua toh aage badho
            if(!set.contains(val - 1)) {
                int current = val;
                int count = 1;

                // jabtk right element hai tb tk aage bdhte raho
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                res_max = Math.max(res_max, count);
            }
        }

        return res_max;
    }
}
