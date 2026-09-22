class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;

        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buy) {
                int profit = prices[i] - buy;
                max = Math.max(max, profit);
            } else {
                buy = Math.min(buy, prices[i]);
            }
        }

        return max;
    }
}
