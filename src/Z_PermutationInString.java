// Day 13 - 8th of April 2026 - Prob #25

import java.util.HashMap;

public class Z_PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";

        System.out.println("Result: " + checkInclusion(s1, s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // storing frequency of s1 string
        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        // storing frequency of first window
        for (int i = 0; i < s1.length(); i++) {
            map2.put(s2.charAt(i), map1.getOrDefault(s2.charAt(i), 0) + 1);
        }

        if (map1.equals(map2))
            return true;

        // now for the rest of window
        for (int i = s1.length(); i < s2.length(); i++) {
            char currChar = s2.charAt(i);
            char oldChar = s2.charAt(i - s1.length());

            map2.put(currChar, map2.getOrDefault(currChar, 0) + 1);

            int count = map2.get(oldChar) - 1;
            if (count == 0)
                map2.remove(oldChar);
            else
                map2.put(oldChar, count);

            if (map1.equals(map2))
                return true;
        }

        return false;
    }
}
