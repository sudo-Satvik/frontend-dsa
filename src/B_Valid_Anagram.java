// Day 1 - 16th of March 2026 - Prob #2

import java.util.*;

public class B_Valid_Anagram {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";

        System.out.println("Result: " + isAnagram(str1, str2));
    }
    public static boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        if (len1 != len2) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < len1; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int value : map.values()) {
            if (value != 0) return false;
        }

        return true;
    }
}
