public class Q_RemoveDuplicateSorted {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Result: " + removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }

        return slow + 1;
    }
}
