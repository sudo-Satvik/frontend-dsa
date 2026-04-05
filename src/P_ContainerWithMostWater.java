// Day 9 - 2nd of April 2026 - Prob #16

public class P_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};

        System.out.println("Result: " + maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int start = 0, end = height.length - 1;
        int max = 0;
        while (start < end) {
            int currArea = Math.min(height[start], height[end]) * (end - start);
            max = Math.max(currArea, max);

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return max;
    }
}
