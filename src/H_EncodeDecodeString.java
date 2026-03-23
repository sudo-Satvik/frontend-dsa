// Day 4- 19th of March 2026 - Prob #8

import java.util.*;

public class H_EncodeDecodeString {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");
        System.out.println("Log of strList: " + strList);
        String encodedData = encode(strList);
        System.out.println("Encoded: " + encodedData);
        System.out.println("Decoded: " + decode(encodedData));
    }

    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            String strLen = String.valueOf(str.length());
            sb.append(strLen).append("#").append(str);
        }

        return sb.toString();
    }

    public static List<String> decode(String str) {
        ArrayList<String> res = new ArrayList<>();

        // using string parsing pointer logic here
        int i = 0;

        while (i < str.length()) {
            int j = i;

            // delimiter
            while (str.charAt(j) != '#') {
                j++;
            }

            // Extracting the length from the encoded string
            int length = Integer.parseInt(str.substring(i, j));

            // Storing actual word and pushing to arraylist
            String word = str.substring(j + 1, j + 1 + length);
            res.add(word);

            // changing i in order to proceed loop
            i = j + 1 + length;
        }
        return res;
    }
}