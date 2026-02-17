class Solution {
    public int maxProfit(int[] prices) {
        
        int buy = prices[0];
        int profit = Integer.MIN_VALUE;

        for(int i = 1; i < prices.length; i++) {
            int currProfit = prices[i] - buy;
            if(currProfit < 0) {
                buy = prices[i];
            }
            profit = Math.max(profit, currProfit);
        }
        if(profit < 0) {
            return 0;
        } else {
            return profit;
        }
    }
}