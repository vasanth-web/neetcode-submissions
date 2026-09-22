class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    int profit = prices[j] - prices[i];
                    max = Math.max(profit, max);
                }
            }
        }

        return max;
    }
}
