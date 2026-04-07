// Day 12 - 7th of April 2026 - Prob #24

import java.util.HashMap;

public class Y_LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println("Result: " + characterReplacement(s, 4));
    }
    public static int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0, left = 0, maxFreq = 0;

        for (int right = 0; right < s.length(); right++) {
            char chRight = s.charAt(right);
            map.put(chRight, map.getOrDefault(chRight, 0) + 1);
            int currFreq = map.get(chRight);
            maxFreq = Math.max(currFreq, maxFreq);

            if ((right - left + 1 - maxFreq) > k) {
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) - 1);
                left++;
            }

            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}
