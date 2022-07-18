//Runtime: 1 ms, faster than 100.00% of Java online submissions for Best Time to Buy and Sell Stock.
//Memory Usage: 59.1 MB, less than 88.18% of Java online submissions for Best Time to Buy and Sell Stock.

/** Prompt:
* You are given an array prices where prices[i] is the price of a given stock on the ith day.
* You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
* Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/


public class SellStock {
    public static void main(String[] args) {
        int[] prices = new int[] {7, 1, 5, 6};
        System.out.print(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int localMax = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) 
        {
            if (prices[i] <= min) {
                min = prices[i];
            }
            localMax = Math.max(prices[i] - min, localMax);
        }
        return localMax;
    }
}
