// Day 5- 24th of March 2026 - Prob #11

import java.util.*;

public class K_DisappearedNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println("Result: " + findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[Math.abs(arr[i]) - 1] > 0)
                arr[Math.abs(arr[i]) - 1] =-arr[Math.abs(arr[i]) - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                res.add(arr[i]);
        }

        return res;
    }
}
