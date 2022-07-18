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
