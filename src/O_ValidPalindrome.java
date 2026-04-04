// Day 8 - 2nd of April 2026 - Prob #13

public class O_ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Result: " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;

        while (start < end) {

            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                return false;

            start++;
            end--;
        }

        return true;
    }
}
