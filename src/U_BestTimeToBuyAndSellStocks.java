// Day 11 - 6th of April 2026 - Prob #21

public class U_BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4,2};

        System.out.println("Result: " + maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for (int price : prices) {
            if (price < minPrice)
                minPrice = price;
            else {
                int profit = price - minPrice;
                maxPrice = Math.max(profit, maxPrice);
            }
        }

        return maxPrice;
    }
}
