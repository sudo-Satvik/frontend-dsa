// Day 3- 18th of March 2026 - Prob #6

import java.util.*;

public class F_ProductArrayItself {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println("Result: " + Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       int[] res = new int[n];
       int suffix = 1;
       res[0] = 1;

       // calculating prefix
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        // calculating suffix
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }

        return res;
    }
}
