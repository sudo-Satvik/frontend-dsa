package concept_learnt;

// Learnt from Valid Palindrome Problem

import java.util.*;

public class F_TwoPointers {
    public static void main(String[] args) {
        int[] arr = {1, 23, 412, 12, 43, 22};

        // opposite direction
        int left = 0;
        int right = arr.length - 1;
        boolean condition = true;

        while (left < right) {
            if (condition) {
                left ++;
            } else {
                right++;
            }
        }

        // same direction - slow-fast pointer
        int slow = 0;

        for (int fast = 1; fast < arr.length; fast++) {
            if (condition) {
                slow++;
                arr[slow] = arr[fast];
            }
        }
    }
}
