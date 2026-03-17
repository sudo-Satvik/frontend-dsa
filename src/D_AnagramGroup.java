// Day 2 - 17th of March 2026 - Prob #4

import java.util.*;

public class D_AnagramGroup {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.print("Result: " + groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String sortedStr = sortedString(str);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static String sortedString(String str) {
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}
